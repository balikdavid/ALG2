
package utils;

import app.Result;
import java.util.Comparator;

/**
 *
 * @author David Bálik
 */
public class ComparatorByPoints implements Comparator<Result> {
        
    @Override
    public int compare(Result r1, Result r2){
        return r1.getPoints() - r2.getPoints();
    }
}
