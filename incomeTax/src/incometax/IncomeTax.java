/*
 *Omar Sayyed
Oct 3rd 2018
Calculates yearly tax owed in Canada as of 2018
 */

package incometax;
import java.util.Scanner;
/**
 *
 * @author omsay9559
 */
public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        // declare variables
       double income, taxFirst,taxSecond, taxThird, taxFourth, taxFifth, taxTotal = 0;
       final double FIRST = 0.15;
       final double SECOND = 0.205;
       final double THIRD = 0.26 ;
       final double FOURTH = 0.29;
       final double FIFTH = 0.33;
       
       
       System.out.println("Enter your yearly income: ");
                    income = keyedInput.nextDouble ();
                    
                    if (income < 46605){
                       taxTotal =  income*FIRST;
                    }else if (income < 93208){
                        taxFirst = 46605*FIRST; 
                        taxSecond = (income - 46605)*SECOND;
                        taxTotal = taxFirst + taxSecond;
                    }else if (income < 144489){ 
                        taxFirst = 46605*FIRST; 
                        taxSecond = 46603*SECOND;
                        taxThird = (income - 93208)*THIRD;
                        taxTotal = taxFirst + taxSecond + taxThird;
                    }else if (income < 205842) {
                        taxFirst = 46605*FIRST; 
                        taxSecond = 46603*SECOND;
                        taxThird = 61359*THIRD;
                        taxFourth = (income - 144489) * FOURTH;
                        taxTotal = taxFirst + taxSecond + taxThird + taxFourth;
                     }else if (income > 205842) {
                       taxFirst = 46605*FIRST; 
                       taxSecond = 46603*SECOND;
                       taxThird = 61359*THIRD;
                       taxFourth = 61353*FOURTH;
                       taxFifth = (income - 205842) * FIFTH;
                       taxTotal = taxFirst + taxSecond + taxThird + taxFourth + taxFifth;
    }
                            
                            
                            System.out.println("your yearly tax rate is $" + taxTotal);
        
    
    
}}
