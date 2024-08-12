package de.vimo.card;

public class Card {
    public String[] cards;
    public int cardNum;
    public Card(int cardNum) {
        cards = new String[]{"ACE","king","Queen"};
        this.cardNum = cardNum;
    }

    public String getStringCard() {
        return cards[this.cardNum];
    }
}
