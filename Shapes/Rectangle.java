
package cvika4_video2_shapes;

/**
 *
 * @author David Bálik
 */

//obdelnik
public class Rectangle extends Shape {
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
        return "Rectangle{" + "a=" + a + ", b=" + b + '}';
    }
    
    @Override
    public double area(){
    return a*b;
    }
    
    
    public static void main(String[] args) {
        //test
    }
}
