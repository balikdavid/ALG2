package elevengame;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David Bálik
 */

public class Board implements BoardInterface {

    //Card[] cards;
    Deck deck;
    private List<Card> boardCards = new ArrayList();
    private int size;

    @Override
    public String getName() {
        return "Eleven game";
    }

    @Override
    public int nCards() {
        return boardCards.size();
    }

    @Override
    public boolean isAnotherPlayPossible() {
        int cQ = 0, cK = 0, cJ = 0;
        for (int i = 0; i < boardCards.size(); i++) {
            for (int j = 1; j < boardCards.size() - i; j++) {
                if (boardCards.get(i).getnPoints() + boardCards.get(j).getnPoints() == 11) {
                    return true;
                }
            }
            if (boardCards.get(i).getValue() == "J") {
                cJ++;
            }
            if (boardCards.get(i).getValue() == "Q") {
                cQ++;
            }
            if (boardCards.get(i).getValue() == "K") {
                cK++;
            }
        }
        if (cJ > 0 && cQ > 0 && cK > 0) {
            return true;
        }
        return false;
    }

    @Override
    public int getDeckSize() {
        return deck.nCardsInDeck();
    }

    @Override
    public String getCardDescriptionAt(int index) {
        return boardCards.get(index).getSymbol() + boardCards.get(index).getValue();
    }

    @Override
    public boolean hasWon() {
        if (deck.isEmpty()) {
            return true;
        }
        return false;
    }

    public Board(String[] symbol, String[] value, int[] points, int size) {
         deck = new Deck(symbol,value ,points);
        this.size = size;
        for (int i = 0; i < size; i++) {
            boardCards.add(deck.getDeckCard(i+1));
        }
    }

    @Override
    public boolean playAndReplace(String[] selectedCardsPositions) {
        int cQ = 0, cK = 0, cJ = 0;
        boolean resume = false;
        if (selectedCardsPositions.length == 2) {
            if (boardCards.get(Integer.parseInt(selectedCardsPositions[0]) - 1).getnPoints()
                    + boardCards.get(Integer.parseInt(selectedCardsPositions[1]) - 1).getnPoints() == 11) {
                resume = true;
            }

        } else if (selectedCardsPositions.length == 3) {
            for (int i = 0; i < 3; i++) {
                if (boardCards.get(Integer.parseInt(selectedCardsPositions[i]) - 1).getValue() == "J") {
                    cJ++;
                }
                if (boardCards.get(Integer.parseInt(selectedCardsPositions[i]) - 1).getValue() == "Q") {
                    cQ++;
                }
                if (boardCards.get(Integer.parseInt(selectedCardsPositions[i]) - 1).getValue() == "K") {
                    cK++;
                }
            }
            if (cJ == 1 && cQ == 1 && cK == 1) {
                resume = true;
            }
        }
        if (resume = true) {
            for (int i = 0; i < selectedCardsPositions.length; i++) {
                boardCards.remove(Integer.parseInt(selectedCardsPositions[i]) - 1);
            }
            for (int i = 0; i < selectedCardsPositions.length; i++) {
                boardCards.add(deck.getDeckCard(i));
                deck.deal();
            }
        }
        return resume;
    }
}
