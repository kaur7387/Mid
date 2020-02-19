/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgamethursday;

/**
 * It has high cohesion
 * It has loose coupling
 *
 * @author Rajdeep
 */
public class CardGameThursday {

    /**
     * @param args the command line arguments
     */
   
    public enum Color{RED, YELLOW, GREEN, BLUE};// USING ENUM AVOIDING STRING TO MAKE LOOSE COUPLING 
    //IF USING STRING IT IS TIGHT COUPLING MEANS MORE DEPENDANCY
   
    private Color suit;
    public enum Value{ACE, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAWTWO, DRAWFOUR, WILDCARD};
   private Value value;
   public CardGameThursday(Color s, Value v )
   {    
       this.suit= s;
       this.value=v;
   }

    /**
     * @return the suit
     */
    public Color getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(Color suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public Value getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Value value) {
        this.value = value;
    }
}
