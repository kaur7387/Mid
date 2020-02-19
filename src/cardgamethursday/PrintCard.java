/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgamethursday;

/**
 *
 * @author Rajdeep
 */
// Harsimran Kaur
public class PrintCard {
    public static void main(String args[])
    {
     GenerateCard c = new GenerateCard();// object to access generate 
    c.generateArray(); // calls the array to generate 60 cards, Delegation is archeived
    for ( CardGameThursday d : c.deck )
    {
        System.out.println(d.getSuit()+"   " +d.getValue());
    }
    
}}
