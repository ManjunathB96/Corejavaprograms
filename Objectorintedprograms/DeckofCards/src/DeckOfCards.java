package Objectorintedprograms.DeckofCards.src;

import java.util.*;

public class DeckOfCards {
    private Card[] deck;
    private static int currentcard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final Random randomNumbers = new Random();

    public DeckOfCards() {
        currentcard = 0;
        String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        String suits[] = {"Clubs", "Diamonds", "Hearts", "Spades"};

        deck = new Card[NUMBER_OF_CARDS];

        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(rank[count % 3], suits[count / 13]);

        }
    }

    public void shuffle() {
        currentcard = 0;
        for (int first = 0; first < deck.length; first++) {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public boolean printDeck() {
        for (int i = 0; i < 4; i++) {                                    // print shuffled deck
            System.out.println("** Person " + (i + 1) + " **");

            if(i % 5 ==0){
                System.out.println();
            }


            for (int j = 0; j < 5; j++) {
                System.out.println(deck[i + j * 4] + " (Card " + (i + j * 4) + ")");
            }
        }

        return false;
    }
}





  /*public Card dealCard(){
        if (currentcard < deck.length){
            return deck[currentcard++];
        }
        else {
            return null;
        }
    }*/
