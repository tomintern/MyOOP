
package calculator;
import java.util.*;

public class Calculator {
 
    
  
   
    public static void main(String[] args) {
          Circle c = new Circle();
        
        float t,t1,t2,t3;
        Scanner sn = new Scanner(System.in);
        System.out.print("Input radius = ");
        t=sn.nextFloat();
        System.out.print("Input radius = ");
        t1=sn.nextFloat();
        System.out.print("Result of Circle = "+c.setradius(t, t1));
        System.out.println("----------------------------------------");
      
        
        System.out.print("Input triangle = ");
        t2=sn.nextFloat();
        System.out.print("Input triangle = ");
        t3=sn.nextFloat();
        System.out.print("Result of triangle = "+c.caltriangle(t2, t3));
        
    }
    
}
