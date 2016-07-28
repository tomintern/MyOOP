
package calculator;
import java.util.*;

public class Calculator {
 
    
  
   
    public static void main(String[] args) {
          Circle c = new Circle();
        
        float t,t1;
        Scanner sn = new Scanner(System.in);
        System.out.print("Input = ");
        t=sn.nextFloat();
        System.out.print("Input = ");
        t1=sn.nextFloat();
        System.out.print("Result of Circle = "+c.setradius(t, t1));
      
        
       
        
    }
    
}
