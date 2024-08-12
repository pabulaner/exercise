package de.vimo;

public class Card {
        private int rank;
        public final static int ACE   = 1;
        public final static int DEUCE = 2;
        public final static int THREE = 3;
        public final static int FOUR  = 4;

        public Card(int rank) {
                this.rank = rank;
        }
        public int getRank() {
                return rank;
        }

        public static String rankToString(int rank) {
                switch (rank) {
                        case ACE:
                                return "Ace";
                        case DEUCE:
                                return "Deuce";
                        case THREE:
                                return "Three";
                        case FOUR:
                                return "Four";
                        default:
                                return null;
                }
        }
}