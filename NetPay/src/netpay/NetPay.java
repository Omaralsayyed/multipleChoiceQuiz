/*
 Omar Sayyed
Sept 19th 2018
Calculates the net pay of someone who works 40 hours (h) at 5.00 per hour (w)
and has 2.00 (i) deducted for insurance and must pay 22% for tax
 */

package netpay;

/**
 *
 * @author omsay9559
 */
public class NetPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //define variables 
        double h = 40;
        double w = 5.00;
        double i = 2.00;
        double t = 0.22;
        double pay = 0.0;        
            
        
        // TODO code application logic here
        // the actual formula 
       pay = (h*w-i)-t*(h*w-i);
       //to display the answer
        System.out.println ("The total pay is $" + pay);
        
    }
    
}
