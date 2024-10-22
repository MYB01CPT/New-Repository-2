/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parallelarrays_ages2;

import javax.swing.*;
import java.util.Scanner;

/**
 *
 * @author JAMIE.M1
 */
public class ParallelArrays_Ages2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        
        //declare the arrays
        //initialise
        
        final int Number_Of_Names = 8; //final since we dont want to make changes to the item
        
        String [] validNames = {"Mordecai", "Rigby", "Benson", "Skips", "Pops", "Muscle Man", "HFG", "Thomas"}; //array 1 - names
        
        int ages [] = {23, 23, 47, 400, 35, 27, 25, 21}; //array 2 - ages
        
        //parallel arrays for character and ages
        //these arrays work in conjunction with each other 
        
        
        int ageOfChar = 0; //age of Character set to zero
        boolean isValidName = false; //checks if name is valid or not
        
        //function that prompts user to input name; stores that name.
        String inputName = JOptionPane.showInputDialog("Please enter the name of the character whose age you want to check:");
                
        //for loop
        for (int i = 0; i < Number_Of_Names; i++){
            if (inputName.equals(validNames[i])){ //if an inputted name is equal to a valid name in the array
                isValidName = true; //then this condition has been met (true)
                ageOfChar = ages[i]; //the index of a character's name will then correspond with the index of a character's age
            }
        }
        
        if(isValidName){
            JOptionPane.showMessageDialog(null, inputName + " is approximately " + ageOfChar + " years old.");
        }//if valid print this
        else {
            JOptionPane.showMessageDialog(null, "Sorry! Invalid character name entered.");
        }//if invalid print that
        
        System.out.print("Please enter a random value (can be a word or number):");
        String random = sc.next();
        
        System.out.println("Your value was '" + random + "'");
        
    }
    
}
