/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package keyedinputdoubles;
import java.util.Scanner;

/**
 *
 * @author omsay9559
 */
public class KeyedInputDoubles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner(System.in);
        
        double value1, value2, result;
        
        System.out.println("Enter the first number");
        value1 = keyedInput.nextDouble ();
        System.out.println("Enter the second number");
        value2 = keyedInput.nextDouble ();
        
        result = value1 / value2;
        
        System.out.println("The result of dividing " + value1 + " by " + value2 + " is " + result + ".");
        // TODO code application logic here
    }
    
}
