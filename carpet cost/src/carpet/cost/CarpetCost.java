/*
 * Omar Sayyed
sept 19th 2018
Finds the cost of a carpet in a room thats 8.5 m by 6 m if the carpet has 
a price of $19.95 per square meter. 
 */

package carpet.cost;

/**
 *
 * @author omsay9559
 */
public class CarpetCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //define variables
        double width = 8.5;
        double length = 6;
       double area = 0.0;
       double price = 19.95;
       double totalCost = 0.0; 
               
        // TODO code application logic here
       //area formula
       area = width*length;
       //cost formula
       totalCost = area*price; 
       //to display
       System.out.println ("the total cost for the carpet will be $" +
               totalCost);
       
    }
    
}
