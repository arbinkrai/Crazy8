package com.Arbin;

/**
 * Created by Arbin on 11/2/2015.
 */
public class Card {
//private fields
    private Suit suit;
    private Rank rank;
    public boolean isFaceUp;
    //constructor method
    public Card(Rank rank,Suit suit){
        this.rank=rank;
        this.suit=suit;
        isFaceUp=false;
    }
    //public methods
    public String getSuit(){
        return suit.printSuit();
    }
    public int getRank(){
        return rank.getRank();
    }
    //get rank as a string
    public String printRank(){
        return rank.printRank();
    }
    public void flipCard(){
        isFaceUp=!isFaceUp;//reverse the value of is FaceUP
    }
    public String toString(){
        String str="";
        if (isFaceUp){
        str+=rank.printRank()+" of "+suit.printSuit();}
        else{
            str="Face Down (nothing to see here)";
        }
        return str;
    }
}
