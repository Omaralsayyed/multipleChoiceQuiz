/*
Omar Sayyed
Sept 19th 2018
display the area o a rectangle that is 5.7 by 4.8 
 */

package area.of.a.rectangle;

/**
 *
 * @author omsay9559
 */
public class AreaOfARectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //define variables
        double width = 5.7;
        double length = 4.8;
       double area = 0.0;
        // TODO code application logic here
       // formula
        area = width*length;
        //to display answer
        System.out.println ("width=" +width);
        System.out.println ("length=" + length);
        System.out.println ("area =" +area);
        
    }
    
}
