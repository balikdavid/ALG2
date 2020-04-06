
package cvika4_video2_shapes;

import java.util.ArrayList;

/**
 *
 * @author David Bálik
 */
public class Main {

    
    public static void main(String[] args) {
       Circle c1 = new Circle(1);
       Circle c2 = new Circle(2);
       Rectangle r1 = new Rectangle(2,3);
       Square s1 = new Square(3);
       
       
      // double areaALL = c1.area() + c2.area() + r1.area() + s1.area(); //1 moznost
       
       ArrayList<Object> shapes = new ArrayList();
       shapes.add(c1); //Circle IS An Object
       shapes.add(c2);
       shapes.add(r1);
       shapes.add(s1);//Square IS A Rectangle IS A Object
       
       double areaAll1 = 0;
       //prochazeni arraylistu
        for (int i = 0;i < shapes.size(); i++) {
            
            //((Circle)shapes.get(0)).area(); //pretypovani na circle
            
            if (shapes.get(i) instanceof Circle) { //pokud je object circle, pretypuj ho na circle
                areaAll1 += ((Circle)shapes.get(i)).area();
                
            }else if (shapes.get(i) instanceof Rectangle){
               areaAll1 += ((Rectangle)shapes.get(i)).area();
        
            }
        }
        System.out.println(areaAll1);
        
        
        
        
       ArrayList<Shape> shapes1 = new ArrayList();
       shapes1.add(c1); //Circle IS An Object
       shapes1.add(c2);
       shapes1.add(r1);
       shapes1.add(s1);//Square IS A Rectangle IS A Objec
       
        double areaAll2 = 0;
        
        for(Shape s : shapes1){
            areaAll2 += s.area(); //polymorfizmus
        }
        
        System.out.println("area 2 is "+areaAll2);
    } 
}
