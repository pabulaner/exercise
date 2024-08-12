package de.vimo;

public class Deck {

    public static int numRanks = 4;
    private Card[] cards;

    public Deck() {
        //cards = new Card(0);
        int rank = Card.ACE;
        cards[rank] = new Card(1);
            /**for (int rank = Card.ACE; rank <= Card.FOUR; rank++) {
                cards[rank-1] = new Card(rank);
            }*/
    }

    public Card getCard(int rank) {
        return cards[rank];
    }
}