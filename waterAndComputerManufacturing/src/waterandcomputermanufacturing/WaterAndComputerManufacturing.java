/*
 *Omar Sayyed
Oct 2nd 2018
calculates amt of water used 
 */

package waterandcomputermanufacturing;
import java.util.Scanner;

/**
 *
 * @author omsay9559
 */
public class WaterAndComputerManufacturing {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        // declare variables
    double combo, water;
    final double WATER_AMT = 1.5;

        //ask user the question
        System.out.println("Enter ow many Computer and Monitor combos you own: ");
            combo = keyedInput.nextDouble ();
        
            //Calculate amt of water used
            water = combo*WATER_AMT;
        
                //tell user how much water was used
                 System.out.println("The amount of water your Monitor and Computer combos have used is " + water + " tons.");
        
                
        
        // TODO code application logic here
    }
    
}
