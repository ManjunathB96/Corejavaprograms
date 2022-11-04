package Objectorintedprograms.DeckofCards.src;

public class DeckOfCard1 {

    public static void main(String[] args) {

        String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};


        int n = SUITS.length * RANKS.length;                // initialize deck
        String[] deck = new String[n];
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
            }
        }


        for (int i = 0; i < n; i++) {                       // shuffle
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }


        for (int i = 0; i < 4; i++) {                                    // print shuffled deck
            System.out.println("** Person " + (i + 1) + " **");
            for (int j = 0; j < 5; j++) {
                System.out.println(deck[i + j * 4] + " (Card " + (i + j * 4) + ")");
            }
        }
    }
}
