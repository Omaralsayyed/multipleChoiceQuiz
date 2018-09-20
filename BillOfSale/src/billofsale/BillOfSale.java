/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package billofsale;

/**
 *
 * @author omsay9559
 */
public class BillOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //stating all variables
        double shirt = 12.49;
        double cash = 20;
        double tax = .13;
        double total = 0.0;
        double hst = 0.0;
        double change = 0.0;
        // TODO code application logic here
        //formulas for different values
                hst = shirt*tax;
                total = shirt + hst;
                change = cash - total;
                //To display values on screen  
                System.out.println ("$" + shirt + " Shirt" +
                        "\n$" + hst + " Tax" +
                        "\n$" + total + " Total Amount Due" +
                        "\n$" + cash + " Amount Givin In Cash" +
                        "\n$" + change + " Change Due");
                
                       
                
                        
    }
    
}
