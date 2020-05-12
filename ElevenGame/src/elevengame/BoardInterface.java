
package elevengame;

/**
 *
 * @author David Bálik
 */
public interface BoardInterface {
    public String getName();
    
    public int nCards();
    
    public boolean isAnotherPlayPossible();
    
    public int getDeckSize();
    
    public String getCardDescriptionAt(int index);
    
    public boolean playAndReplace(String[] selectedCardsPositions);
    
    public boolean hasWon();
}
