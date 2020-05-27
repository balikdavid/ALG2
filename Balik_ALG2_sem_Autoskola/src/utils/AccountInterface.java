package utils;

/**
 *
 * @author David Bálik
 */
public interface AccountInterface {
    /**
     * Getter to account username
     * @return 
     */
    public String getUsername();
    
    /**
     * Method for saving results
     * @param points int number of points in text
     * @param successful bollean value if test was successful
     */
    public void saveResults(int points, boolean successful);
    
    /**
     * Returns accounts statistics of the test
     * Returns number of done tests
     * Returns  number of successful and unsuccessful questions
     * Returns sum of earned points in all tests compared to sum of total points
     * in all tests
     * @return 
     */
    public String getStatistics();
    
    /**
     * Saves statistics to PDF file named username-statistics.pdf
     * @return true if the saving was successful
     */
    public boolean saveStatisticsToPdf();
    
    /**
     * Sends account statistics to given email
     * @param email
     * @return 
     */
    public boolean sendStatisticsToMail(String email);
    
    /**
     * returns all completed test results sorted descending by points
     * @return String sorted tests
     */
    public String getSortedPointsDescending();
    
    
    /**
     * returns all completed test results sorted ascending by points
     * @return  String sorted tests
     */
    public String getSortedPointssAscending();
   
    
    
    
}
