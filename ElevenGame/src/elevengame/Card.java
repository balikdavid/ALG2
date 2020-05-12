
package elevengame;

/**
 *
 * @author David Bálik
 */
public class Card {
    private String symbol;  
    private String value;  //rank
    private int nPoints; 
    
    //methods

    public Card(String symbol, String value, int nPoints) {
        this.symbol = symbol;
        this.value = value;
        this.nPoints = nPoints;
    }

    public String getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getnPoints() {
        return nPoints;
    }

    @Override
    public String toString() {
        return "Card{" + "symbol = " + symbol + ", value = " + value + ", nPoints = " + nPoints + '}';
    }
    
    
}
