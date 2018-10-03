/*
 *  *Omar Sayyed
Oct 3rd 2018
Calculates total for elctronic purchases




/**
 *
 * @author omsay9559
 */

package shopping;
import java.util.Scanner;

public class Shopping {
//   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
            // declare variables
       double subtotal, tax, numMice,total, numKeyboard,numUsb;
       final double USB = 19.99;
       final double KEYBOARD = 49.99;
       final double MOUSE = 25.99;
       final double TAX = 0.13;
   
//       double roundOff; 
//        roundOff = Math.round(total * 100.0) / 100.0;
    
       //ask user how many of each they would like to purchase 
            System.out.println("Enter how many USB storage devices you would like to purchase: ");
                    numUsb = keyedInput.nextDouble ();

            System.out.println("Enter how many Keyboards you would like to purchase: ");
                    numKeyboard = keyedInput.nextDouble ();

            System.out.println("Enter how many Computer Mice you would like to purchase: ");
                    numMice = keyedInput.nextDouble ();
                    
                    // formula for calculating subtotal and tax and grandtotal
                    subtotal = (numUsb*USB) + (numKeyboard*KEYBOARD) + (numMice*MOUSE);
                    total = (subtotal*TAX) + subtotal;
                    
                    // Output the subtotal, tax and grand total t the screen
                        System.out.println("The subtotal for you purchase is $" + subtotal);
                        System.out.println("The tax for you purchase is $" + subtotal*TAX);
                        System.out.println("The grand total for you purchase is $" + total);
                    
                    

            
            
        // TODO code application logic here
    }
    
}
