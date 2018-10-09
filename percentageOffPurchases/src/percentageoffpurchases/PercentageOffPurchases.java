/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package percentageoffpurchases;
import java.util.Scanner;
/**
 *
 * @author omsay9559
 */
public class PercentageOffPurchases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyedInput = new Scanner(System.in);
       
       //declaring variables 
       double subtotal, grandTotal, amtSaved;
       
       //ask user for subtotal
        System.out.println("Please enter the pre-discount total: ");
        subtotal= keyedInput.nextDouble ();
        
        //decides the discount
        if (subtotal > 120)
        {
            //telling user the percentage saved
            System.out.println("You spent: $" + subtotal);
            System.out.println("you are saving 40%");
            grandTotal= subtotal * 0.60;
            //rounding grandtotal
             grandTotal = grandTotal * 100;
            grandTotal = Math.round (grandTotal);
            grandTotal = grandTotal / 100;
            //rounding amt saved
            amtSaved= subtotal - grandTotal;
             amtSaved = amtSaved * 100;
            amtSaved = Math.round (amtSaved);
            amtSaved = amtSaved / 100;
            //telling user total and amt saved
            System.out.println("Your Grand Total is " + grandTotal);
            System.out.println("you are saving $" + amtSaved  );
        }
        else if (subtotal > 80) {
            //telling user the percentage saved
            System.out.println("You spent: $" + subtotal);
            System.out.println("you are saving 30%");
            grandTotal= subtotal * 0.70;
            //rounding grandtotal
             grandTotal = grandTotal * 100;
            grandTotal = Math.round (grandTotal);
            grandTotal = grandTotal / 100;
             //rounding amt saved
            amtSaved= subtotal - grandTotal;
             amtSaved = amtSaved * 100;
            amtSaved = Math.round (amtSaved);
            amtSaved = amtSaved / 100;
            //telling user total and amt saved
            System.out.println("Your Grand Total is " + grandTotal);
            System.out.println("you are saving $" +  amtSaved );
        }
        else if (subtotal > 40) {
            //telling user the percentage saved
            System.out.println("You spent: $" + subtotal);
            System.out.println("you are saving 20%");
            grandTotal= subtotal * 0.80;
            //rounding grandtotal
             grandTotal = grandTotal * 100;
            grandTotal = Math.round (grandTotal);
            grandTotal = grandTotal / 100;
             //rounding amt saved
            amtSaved= subtotal - grandTotal;
             amtSaved = amtSaved * 100;
            amtSaved = Math.round (amtSaved);
            amtSaved = amtSaved / 100;
            //telling user total and amt saved
            System.out.println("Your Grand Total is " + grandTotal); 
            System.out.println("you are saving $" +  amtSaved );
    }
        else 
        {
            //telling user the percentage saved
            System.out.println("You spent: $" + subtotal);
            System.out.println("you are saving 10%");
            grandTotal= subtotal * 0.90;
            //rounding grandtotal
            grandTotal = grandTotal * 100;
            grandTotal = Math.round (grandTotal);
            grandTotal = grandTotal / 100;
             //rounding amt saved
            amtSaved= subtotal - grandTotal;
             amtSaved = amtSaved * 100;
            amtSaved = Math.round (amtSaved);
            amtSaved = amtSaved / 100;
            //telling user total and amt saved
            System.out.println("Your Grand Total is " + grandTotal); 
            System.out.println("you are saving $" +  amtSaved );
        }
    
}}
