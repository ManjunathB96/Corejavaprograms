package Objectorintedprograms.DeckofCards.src;

public class Card {
    private String face;
    private String suits;

    public Card(String  cardFace, String cardSuits){
        face = cardFace;
        suits = cardSuits;
    }
    public String toString(){
        return face+" of "+suits;
    }
}
