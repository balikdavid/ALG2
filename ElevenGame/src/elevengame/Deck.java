
package elevengame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author David Bálik
 */
public class Deck {
    
    private List<Card> deckCards = new ArrayList();
    private int deckCardsSize;
    private String[] symbol;
    private String[] value;
    private int[] nPoints;
    
    // methods
    public Deck(String[] symbol, String[] value, int[] points) {
        for (int i = 0; i < symbol.length; i++) {
            for (int j = 0; j < value.length; j++) {
                Card c = new Card(symbol[i], value[j], points[j]);
                deckCards.add(c);
            }
        }
        shuffle();
    }
    
    
    public int nCardsInDeck(){
        return deckCardsSize = deckCards.size();
    }
    
    public int deal(){
       // return deckCards.size()-1;
       return deckCardsSize--;
    }
    public void shuffle(){
        Collections.shuffle(deckCards);
    }
    
    public boolean isEmpty(){
        if(deckCards.size() == 0){
            return true;
        }
        return false;
    }

    public List<Card> getDeckCards() {
        return deckCards;
    }
    
    public Card getDeckCard(int index){
        return deckCards.get(index);
    }
    
    
}
