
package interfacevariant;

import cvika4_video2_shapes.*;

/**
 *
 * @author David Bálik
 */


//IS A vztah... every square IS A rectangle
public class Square extends Rectangle{ //extends = dědí
    private double a; //strana
    
    //constructor
    public Square(double a){
        super(a,a);  //super misto .this, zavolam v podstate konstruktor obdelniku
    }
    
//    @Override
//    public String toString(){
//       return "Square{" + "a = " + a + "}";
//    }
    
    public static void main(String[] args) {
        Square s = new Square(4);
        System.out.println(s.area());
    }
    
}
