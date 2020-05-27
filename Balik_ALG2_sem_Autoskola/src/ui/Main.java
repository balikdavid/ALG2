
package ui;

import app.Account;
import app.Question;
import app.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.AccountInterface;
import utils.Mail;

/**
 *
 * @author David Bálik
 */
public class Main {

    public static AccountInterface activeAccount;

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean end = false;

        while (!end) {
            displayMenu();
            String choice = sc.next();
            switch (choice) {
                case "1":
                    createNewAccount();
                    break;

                case "2": {
                    boolean isLoginSuccessful = login();
                    if (isLoginSuccessful) {
                        accountActions();

                    }
                }
                break;

                case "3":
                    end = true;
                    break;

                default:
                    System.out.println("Neplatná volba, další pokus.");

            }
        }
    }

    private static void displayMenu() {
        System.out.println("");
        System.out.println("****************************************Autoškolové testy***************************************");
        System.out.println("                                                                                                ");
        System.out.println("Dobrý den, připravte se na autoškolu pokusnými testy.                                           ");
        System.out.println("Pro uchování všech vašich výsledků si prosím vytvořte nový účet, nebo se přihlaste.             ");
        System.out.println("                                                                                                ");
        System.out.println("Stiskněte jedničku (1) pro vytvoření nového účtu.                                               ");
        System.out.println("Stiskněte dvojku (2) pro přihlášení.                                                            ");
        System.out.println("Stiskněte trojku (3) pro ukončení aplikace");

    }

    private static void createNewAccount() {
        System.out.println();
        System.out.println("Zadejte nové uživatelské jméno.");
        String username = "";
        boolean isUsernameValid = false;

        while (!isUsernameValid) {
            username = sc.next();
            File accountFile = new File("accounts" + File.separator + username + ".dat");
            if (accountFile.exists()) {
                System.out.println("Uživatelské jméno je obsazeno");
            } else {
                isUsernameValid = true;
            }
        }
        try {
            activeAccount = new Account(username);
            System.out.println();
            System.out.println("Váš účet byl vytvořen, nyní se prosím přihlaste.");
            System.out.println("Vaše uživatelské jméno je: " + username);
        } catch (IOException e) {
            System.out.println();
            System.out.println("Něco se pokazilo, zkuste to prosím znovu");
            System.out.println();
        }
    }

    private static boolean login() {
        System.out.println();
        System.out.println("Zadejte uživatelské jméno");
        String username = sc.next();
        File accountFile = new File("accounts" + File.separator + username + ".dat");

        if (accountFile.exists()) {
            try {
                activeAccount = new Account(username);
                return true;
            } catch (IOException e) {
                System.out.println("error");
                return false;
            }
        } else {
            System.out.println("Účet neexistuje.");
            return false;
        }
    }

    private static void accountActions() {
        boolean end = false;

        while (!end) {
            displayAccountMenu();
            String choice = sc.next();
            switch (choice) {
                case "1":
                   getTestInfo();
                    break;
                case "2":
                {
                    try {
                        startTest();
                    } catch (FileNotFoundException ex) {
                        System.out.println("Není přidán soubor s otázkami.");
                    }
                }
                    break;

                case "3" : getStatistics()    ;break;
                case "0":
                    end = true;
                    break;
                default:
                    System.out.println("Neplatná volba, zvolte znovu.");
            }
        }
    }

    private static void displayAccountMenu() {
        System.out.println();
        System.out.println("Stiskněte jedničku (1) pro informace o testu.");
        System.out.println("Stiskněte dvojku (2) pro spuštění testu.");
        System.out.println("Stiskněte trojku (3) pro zobrazení vašich statistik.");
        System.out.println("Stiskněte nulu (0) pro odhlášení.");
    }
    
     private static void getTestInfo() {
         System.out.println("");
         System.out.println("Tento test se skládá z 25 otázek, "
                            + "kde každá otázka má právě jednu správnou odpověď. ");
         System.out.println("Maximální dosažitelný počet bodů je 50. "
                 + "Otázky mají různé bodové ohodnocení.");                     
         System.out.println("Pro úspěšné absolvování testu je potřeba získat alespoň 43 bodů.");
         System.out.println();
     
     }

    private static void startTest() throws FileNotFoundException {
        Test test = new Test();
        final int NUMBER_OF_QUESTIONS = test.getNUMBER_OF_QUESTIONS();
        final int SUCCESS__POINT_LIMIT = test.getSUCCESS__POINT_LIMIT();
        Question[] q = test.getQuestions();
        int points = 0;
        
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            System.out.println();
            System.out.println("Otázka číslo " + (i + 1) + ": ");
            System.out.println(q[i].toString());
            System.out.println("Vaše odpověď je: "); 
            String answer = sc.next();
            if (answer.equalsIgnoreCase(q[i].getCorrectAnswer())) {
                System.out.println("Správná odpověď");
                points += q[i].getPoints();
                
            }else{
                System.out.println("Špatná odpověď");
                System.out.println("Správná odpověď je " + q[i].getCorrectAnswer());
            } 
        }
        boolean successful = (points >= SUCCESS__POINT_LIMIT);
        System.out.println();
        System.out.println("Konec testu "
                + "získal/a jste " + points + "bodů.");
        if(successful){
            System.out.println("Uspěl/a jste.");
        }else{
            System.out.println("Zkuste to příště.");
        }
        activeAccount.saveResults(points, successful);
    }

    private static void getStatistics() {
        System.out.println();
        System.out.println(activeAccount.getStatistics());
        boolean end = false;

        while (!end) {
            displayStatisticsMenu();
            String choice = sc.next();
            switch (choice) {
                case "1" :System.out.println(activeAccount.getSortedPointsDescending());break;    //Comparable, sestupne
                case "2" : System.out.println(activeAccount.getSortedPointssAscending());break;   //Comparator, vzestupne
                case "3":
                    activeAccount.saveStatisticsToPdf();
                    System.out.println("Vaše statistiky byly vyexportovány do pdf souboru s názvem " 
                            + activeAccount.getUsername() + "_statistics.pdf");
                    break;
                case "4":
                    sendToEmail();
                    break;
                case "0": end = true; break;
                default:
                    System.out.println("Neplatná volba, zvolte znovu.");
            }

        }

    }
    

    private static void displayStatisticsMenu() {
        System.out.println();
        System.out.println("Kterou další akci chcete provést?");
        System.out.println();
        System.out.println("Stiskněte jedničku (1) pro vzestupne serazeni podle bodu "); 
        System.out.println("Stiskněte dvojku (2) pro sestupne serazeni podle bodu"); // serazeni podle bodu sestupne
        System.out.println("Stiskněte trojku (3) pro pdf soubor s Vašimi statistikami.");
        System.out.println("Stiskněte čtyřku (4) pro zaslání pdf souboru s Vašimi statistikami na email.");
        System.out.println("Stiskněte nulu (0) pro návrat do menu");

    }
    
    
   

    private static void sendToEmail() {
        System.out.println("Zadejte prosím Váš email");
        String email = "";
        final var EMAIL_RV = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."
                + "[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b"
                + "\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01"
                + "-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]"
                + "*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25"
                + "[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4]"
                + "[0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x"
                + "0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x"
                + "0b\\x0c\\x0e-\\x7f])+)\\])";
        boolean validEmail = false;
        
        while(!validEmail){
            email = sc.next();
            if (email.matches(EMAIL_RV)) {
                validEmail = true;
            }else{
                System.out.println("Neplatná emailová adresa");
            }
        }
        if (activeAccount.sendStatisticsToMail(email)){
            System.out.println("Statistiky byly odeslány na výše uvedený email"); 
        }else{
            System.out.println("Nepodařilo se odeslat na email.");
        }
    }

   

}
