
package cvika4_video2_shapes;

/**
 *
 * @author David Bálik
 */
public class Circle extends Shape{
    //data
    
    private double r; //polomer kruhu
    

    public Circle(double r) {
        this.r = r;
    }
    
    public static Circle getInstance(double d){
        return new Circle(d/2);
    }
    
    public static Circle getInstanceR(double r){
        return new Circle(r);
    }
    //TODO udelat pomoci tovarni metody
////   public Circle(double d) {
//      this.r = d/2;
//    }

    public double getR() {
        return r;
    }

    @Override
    public String toString() {
        return "Circle{" + "r = " + r + '}';
    }
    
    
    @Override
    public double area(){
        return Math.PI*r*r;
    }
    
    public static void main(String[] args) {
      Circle a = new Circle(2);
        System.out.println(a);
      System.out.println(a.area());
        
        
        Circle c =  Circle.getInstanceR(4);
        System.out.println(c);
        System.out.println(c.area());
    }
    
}
