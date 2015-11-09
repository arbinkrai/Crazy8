package com.Arbin;
import java.util.*;
public class Crazy8 {

    public static void main(String[] args) {
        System.out.println("Welcome to the game of Crazy8");
        Scanner user = new Scanner(System.in);
        //creating deck
        Deck d1 = new Deck();
        d1.gather();
        d1.shuffle();
        //creating hand
        Hand userPlayer, dealer, discard;
        userPlayer = new Hand();
        dealer = new Hand();
        discard = new Hand();
        Hand[] hand = {userPlayer, dealer, discard};
        //deal cards to hand and dealer
//
        d1.deal(userPlayer, 5);
        d1.deal(dealer, 5);
        d1.deal(discard, 1);
        //show players the hand
//        hand[0].flipCards();
//        System.out.println(hand[0].showHand());
        int c = 0;

        do {
            System.out.println(dealer.showHand());
            System.out.println(discard.showHand());
            System.out.println(userPlayer.showHand());
            String userChoice;
            do {
                if (c % 2 == 0) {
                    System.out.println("Which card do you wnat to discard ?");
                    userChoice = user.nextLine();

                }
                while (!userPlayer.cards.contains(userChoice)) ;
                if (c % 2 == 0) {

                    userPlayer.cards.remove(userChoice);
                    //discard.add(userChoice);
                    c = c + 1;
                }
            }
            while ((dealer.cards.size() > 0) || (userPlayer.cards.size() > 0));
//       flipping the first card of the remaining cards on the deck

            System.out.println("Undelt card remaining in the deck is: " + d1.cards.size());

            discard.cards.get(0).flipCard();
            dealer.cards.get(0).flipCard();



        }
    }
}