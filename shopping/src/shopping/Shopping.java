/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shopping;
import java.util.Scanner;
/**
 *
 * @author omsay9559
 */
public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
            // declare variables
       double subtotal, tax, total, numMice, numKeyboard,numUsb;
       final double USB = 19.99;
       final double KEYBOARD = 49.99;
       final double MOUSE = 25.99;
       final double TAX = 0.13;
    
            System.out.println("Enter how many USB storage devices you would like to purchase: ");
                    numUsb = keyedInput.nextDouble ();

            System.out.println("Enter how many Keyboards you would like to purchase: ");
                    numKeyboard = keyedInput.nextDouble ();

            System.out.println("Enter how many Computer Mice you would like to purchase: ");
                    numMice = keyedInput.nextDouble ();
                    
                    subtotal = (numUsb*USB) + (numKeyboard*KEYBOARD) + (numMice*MOUSE);
                    total = (subtotal*TAX) + subtotal;
                    
                        System.out.println("The subtotal for you purchase is $" + subtotal);
                        System.out.println("The tax for you purchase is $" + subtotal*TAX);
                        System.out.println("The total for you purchase is $" + total);
                    
                    

            
            
        // TODO code application logic here
    }
    
}
