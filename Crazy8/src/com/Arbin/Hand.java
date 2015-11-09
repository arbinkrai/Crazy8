package com.Arbin;

import java.util.ArrayList;

/**
 * Created by Arbin on 11/2/2015.
 */
public class Hand {
    public ArrayList<Card> cards;
    //constructor
    public Hand(){
        cards=new ArrayList<Card>();
    }
    public void clear(){
        cards.clear();
    }
    public void add(Card card){
        cards.add(card);
    }

    public String showHand(){
        String str="";
        for (Card c:cards){
            str+=c.toString()+" | ";
        }
        return str;
    }
    public int getTotal(){
        int totalPen=0;
        boolean hasAce=false;
        for (int i=0;i<cards.size();i++) {
        totalPen+=cards.get(i).getRank();
            //check to see if card is an Ace
            if (cards.get(i).printRank()=="Ace"){
                hasAce=true;
            }
            //Make ACE worth 11 if total points<=11
            if (hasAce &&totalPen<=11 ){
                totalPen+=10;//add 10 more to the Ace
            }
        }
            return totalPen;
    }

    public void flipCards(){
        for (Card c:cards){
            c.flipCard();
        }
    }
    public boolean give(Card card,Hand anotherHand){
        if (!cards.contains(card)){
            return false;}
        else{
            cards.remove(card);
            anotherHand.add(card);
            return true;
        }
    }
}
