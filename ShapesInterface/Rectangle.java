
package interfacevariant;


/**
 *
 * @author David Bálik
 */

//obdelnik
public class Rectangle implements ShapeInterface {
    //data
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public String toString() {
        //return "Rectangle{" + "a=" + a + ", b=" + b + '}';
       return super.toString() + String.format(" a = %.2f  b = %.2f ",a,b);
    }
    
    @Override
    public double area(){
    return a*b;
    }
    
    @Override
    public int compareTo(interfacevariant.ShapesApp o) {
        if((this.area() - o.area())>0){
            return 1;
        }
        else if((this.area() - o.area())<0){
            return -1;
        }
        else{
            return 0;
        }
    }
    
    
    public static void main(String[] args) {
        //test
    }

   

   

  
}
