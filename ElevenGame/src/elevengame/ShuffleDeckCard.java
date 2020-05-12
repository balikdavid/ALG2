
package elevengame;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author David Bálik
 */
public class ShuffleDeckCard implements ShuffleInterface {

    @Override
    public void Shuffle(ShuffleInterface o) {
        Collections.shuffle((List<?>)o);
    }
    
}
