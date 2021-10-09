/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 *
 * @author Amna Khan
 * Student ID 991556455
 * A class of Cards
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
   
   public Card(String givenSuit, int genValue) {
      suit = givenSuit;
       int givenValue = 0;
      value = givenValue;
   }
   
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
       if(suit.equals("Hearts") || suit.equals("Diamonds") || suit.equals("Clubs") || suit.equals("Spades")) {
       this.suit = suit;
    }
       else {
          System.out.println("The suit assigned is not valid");
          System.out.println("Choose: Hearts, Diamonds, Spades, and Clubs");
       }
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        if((value < 1) || (value > 13)) {
           System.out.println("Value of the card has to be between 1 to 13");
        }
       else {
       this.value = value;
    }    
}
}


