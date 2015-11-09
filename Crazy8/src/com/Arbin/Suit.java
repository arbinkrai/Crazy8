package com.Arbin;

/**
 * Created by Arbin on 11/2/2015.
 */
public enum Suit {
    HEARTS("Hearts"),
    SPADES("Spades"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs");
    private final String suitText;
    //constructor
    private Suit(String suitText){
        this.suitText=suitText;
    }
    //public methond
    public String printSuit(){
        return suitText;
    }
}
