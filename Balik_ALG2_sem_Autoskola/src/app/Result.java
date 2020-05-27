package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author David Bálik
 */
public class Result implements Comparable<Result>{
    private int points;
    private LocalDateTime date;
    private boolean successful;
    

    public Result(int points, LocalDateTime date, boolean successful) {
        this.points = points;
        this.date = date;
        this.successful = successful;
    }
    /**
     * Creates a new instance of Result with actual date and time
     * @param points int - earned points in Test
     * @param successful boolean - if test was successful
     */
    Result(int points, boolean successful) {
         this.points = points;
         this.successful = successful;
         date = LocalDateTime.now();
    }

    boolean isSuccessful(){
        return successful;
    }
    

    public int getPoints() {
        return points;
    }

    public LocalDateTime getDate() {
        return date;
    }
    
    
    @Override
    public String toString(){
        return date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm")) + " - " + (successful? "úspěšný" : "neúspěšný") + ", " + points + " bodů";

    }

    //pocet ziskanych bodu
    @Override
    public int compareTo(Result r) {
        return points - r.getPoints();
    }
    
}
