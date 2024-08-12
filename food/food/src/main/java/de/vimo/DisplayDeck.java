package de.vimo;


public class DisplayDeck {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Card card = deck.getCard(1);
        System.out.println(card);
            /**for (int rank = Card.ACE; rank <= Card.FOUR; rank++) {
                Card card = deck.getCard(rank);
                System.out.format(card.rankToString(card.getRank()));
            }*/
    }
}