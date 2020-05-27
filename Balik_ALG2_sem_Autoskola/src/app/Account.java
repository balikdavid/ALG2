package app;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import utils.AccountInterface;
import utils.ComparatorByPoints;
import utils.Mail;

/**
 *
 * @author David Bálik
 */
public class Account implements AccountInterface {
    private String username;
    private File accountFile;
    private ArrayList<Result> latestTestList = new ArrayList();
    
    
    /**
     * Method Account creates a new instance of Account
     * @param username String = account username
     * @throws IOException 
     */
    public Account(String username) throws IOException {
        this.username = username;
        File accountsFolder = new File("accounts");
          if(!accountsFolder.exists()){
            accountsFolder.mkdir();
        }
        accountFile = new File("accounts" + File.separator + username + ".dat");
        if(accountFile.exists()){
            loadFile();
        }else{
            accountFile.createNewFile();
        }
    }
    
    //Method loads file "accountfile"
     private void loadFile() throws IOException {
        try(DataInputStream in = new DataInputStream(new FileInputStream(accountFile))){
            
            LocalDateTime date;
            int points;
            boolean successful; 
                                 
            while(in.available() != 0){
                date = LocalDateTime.parse(in.readUTF());
                points = in.readInt();
                successful = in.readBoolean();
                latestTestList.add(new Result(points,date, successful));
            } 
        }
    }
    
    
    @Override
    public String getUsername() {
        return username;
    }
    
      @Override
    public String toString() {
        return "Account" + username;
    }
    /**
     * Method getStatistics returns statistics of test to logged account
     * Returns number of completed tests
     * Returns count of successfull and unsuccessful tests
     * Returns sum of earned points in all tests compared to sum of total points of all tests
     * @return String statistics
     */
      @Override
    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append("Doposud jste absolvoval/a ").append(latestTestList.size()).append(" testu.").append("\n");
        sb.append("Pocet uspesnych testu: ").append(numberOfSuccTests()).append("\n");
        sb.append("Pocet neuspesnych testu: ").append(numberOfUnsuccTests()).append("\n");
        sb.append("Celkove jste ziskal/a ").append(totalEarnedPoints()).append(" bodu z celkovych ").append(totalPoints()).append(" moznych.").append("\n");
        sb.append("Vaswe testy:\n");
        for (Result result : latestTestList) {
            sb.append(result.toString()).append("\n");
        }
        return sb.toString();
    }
    /**
     * Returns all completed test result sorted descending by number of points
     * @return String sorted tests
     */
    @Override
    public String getSortedPointsDescending(){   //sestupně pomocí Comparable
        ArrayList<Result> latestTestsListCopy = new ArrayList();
        for (Result result : latestTestList) {
            latestTestsListCopy.add(result);
        }
        //sort
        Result temp;
        for (int i = 0; i < latestTestsListCopy.size(); i++) {
            for (int j = 0; j < latestTestsListCopy.size() - i - 1; j++) {
                if(latestTestsListCopy.get(j).compareTo(latestTestsListCopy.get(j+1)) < 0){
                    temp = latestTestsListCopy.get(j);
                    latestTestsListCopy.set(j, latestTestsListCopy.get(j+1));
                    latestTestsListCopy.set(j+1, temp);
                }
            }
        }
      StringBuilder sb = new StringBuilder();
        for (Result result : latestTestsListCopy) {
           sb.append(result.toString()).append("\n"); 
        }
        return sb.toString();
    }
    
    /**
     * Returns all completed test result sorted ascending by number of points
     * @return String sorted tests
     */
        @Override
    public String getSortedPointssAscending(){   //vzestupně pomocí Comparatoru
        ArrayList<Result> latestTestsListCopy = new ArrayList();
        for (Result result : latestTestList) {
            latestTestsListCopy.add(result);
        }
        //sort
        Collections.sort(latestTestsListCopy, new ComparatorByPoints());
        
        StringBuilder sb = new StringBuilder();
        for (Result result : latestTestsListCopy) {
           sb.append(result.toString()).append("\n"); 
        }
        return sb.toString();
    }
   
    /**
     * Sends account statistics to given email
     * @param recipient String - email adress
     * @return if successfull - true, else nothing
     */
        @Override
    public boolean sendStatisticsToMail(String recipient){
        String statistics = getStatistics();
        try {
            Mail.sendMail(recipient, statistics);
            return true;
        } catch (MessagingException ex) {
            return false;
        }
    }
    
    
    /**
     * Saves results
     * @param points int number of points in test
     * @param successful boolean value if test was successful or not
     */
     @Override
    public void saveResults(int points, boolean successful) {
        Result result = new Result(points, successful);
        latestTestList.add(result);
        writeResultToFile(result);
    }
    
    /**
     * Saves statistics to pdf file named username-statistics.pdf
     * @return 
     */
    @Override
    public boolean saveStatisticsToPdf() {
        try {
            Document document = new Document(); 
            PdfWriter.getInstance(document, new FileOutputStream(username + "-statistics.pdf")); 

            String statistics = getStatistics();
            document.open(); 
            document.add(new Paragraph("Uživatelské jméno: " + username));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(statistics));
            document.close();
            return true;
            
        } catch (FileNotFoundException e) {
            return false;
        } catch (DocumentException ex) {
            return false; 
        } 
    }
        /**
         * Counts number of successful tests
         * @return number of succ. tests
         */
        private int numberOfSuccTests(){
        int n = 0;
        for (Result result : latestTestList) {
            if(result.isSuccessful()){
                n++;
            }
        }
        return n;
    }
   
        /**
         * Counts number of unsuccessful tests
         * @return number of unsuccessful tests
         */
    private int numberOfUnsuccTests(){
        int n = 0;
        for (Result result : latestTestList) {
            if(!result.isSuccessful()){
                n++;
            }
        }
        return n;
    }
    /**
     * Counts sum of all achieved points
     * @return total earned points
     */
     private int totalEarnedPoints(){
        int sum = 0;
        for (Result result : latestTestList) {
            sum += result.getPoints();
        }
        return sum;
    }
     /**
      * Counts maximum points which could be achieved
      * @return 
      */
     private int totalPoints(){
        int maxTestPoints = 50;
        return latestTestList.size() * maxTestPoints;
    }

       /**
        * Writes result to accountfile file (zapisuje vysledek do accountfile souboru)
        * @param result 
        */
    private void writeResultToFile(Result result){
        try(DataOutputStream out = new DataOutputStream(new FileOutputStream(accountFile, true))){
            String date = result.getDate().toString();
            int points = result.getPoints();
            boolean successful = result.isSuccessful();
            out.writeUTF(date);
            out.writeInt(points);
            out.writeBoolean(successful);
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        } 
    }

    }

   