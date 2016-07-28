
package calculator;


public class Circle {
    public static float r;
    public static float r1;
    public static float pi = (float) 3.14;
    public static float  sum;
    public Circle(){
        
    }
    public float setradius(float r ,float r1){
        this.r=r;
        this.r1=r1;
        this.sum=sum;
  
        sum = pi*(r*r1);
    
        return sum;
        
    }
    
}
