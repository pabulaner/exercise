package de.vimo.card;

public class Deck {
    private Card[] cards;

    public Deck() {
        cards = new Card[2];
    }

    public Card getCard(int cardNum) {
        return cards[cardNum];
    }
}
