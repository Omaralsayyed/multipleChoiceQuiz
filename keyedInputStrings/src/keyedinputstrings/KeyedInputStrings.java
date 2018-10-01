/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package keyedinputstrings;
import java.util.Scanner;

/**
 *
 * @author omsay9559
 */
public class KeyedInputStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner keyedInput = new Scanner(System.in);
        
        String word1, word2, together;
        
        System.out.println("Enter the first word");
        word1 = keyedInput.nextLine ();
        System.out.println("Enter the second word");
        word2 = keyedInput.nextLine ();
        
        together = word1 + word2;
        
        System.out.println("When you concatenate " + word1 + " and " + word2 + " you get " + together+ ".");
        
        // TODO code application logic here
    }
    
}
