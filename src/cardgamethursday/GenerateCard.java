/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgamethursday;

/**
 * class is controller class, generates 60 cards and store in array
 *
 * @author Rajdeep
 */
public class GenerateCard {
    private int numberofcards= 60;
    CardGameThursday [] deck= new CardGameThursday [numberofcards]; // array of object declaration
    // generate 60 cards and store in array
    public void generateArray()
    {
        //CardGameThursday c1= new CardGameThursday(s,v)
      int count=0; 
        for(CardGameThursday. Color s : CardGameThursday.Color.values())// read color value from enum
        {
            for(CardGameThursday.Value v : CardGameThursday.Value.values())//read values value from enum
            {
                
                deck[count]= new CardGameThursday(s,v);// constructor
                count++;
            }
    }
    
}}
