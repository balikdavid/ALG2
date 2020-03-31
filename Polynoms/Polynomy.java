
package cvika3_videohovor1;

/**
 *Library knihovni trida
 * @author David Bálik
 */
public class Polynomy {
    private Polynomy(){
   
    }
    
    public static Polynom sum(Polynom a, Polynom b){ //nemusime delat defenzivni kopii protoze polynom je immutable, nemenny
    //5x3 + 2x2       + 3         zapis znamena 5x^3...
         //   4x2 + x + 2
         // 5x3 + 6x2 + x + 5
         
    //double [] sum;
    Polynom max = a.getDegree() > b.getDegree() ? a : b; //a > b potom max = a
    Polynom min = a.getDegree() <= b.getDegree() ? a : b;
    double [] sum = new double[max.getDegree()+1];
    
        for (int i = 0; i < sum.length; i++) {
            double d = sum[i];
            sum[i] = max.getCoefAt(i);
            
        }
        for (int i = 0; i < min.getDegree() + 1; i++){
            sum[i] +=min.getCoefAt(i);
        }
        return Polynom.getInstanceReverted(sum);
   }
    
    
    //bez secteni jednotlivych prvku
    
    /*public static String multiply(Polynom a, Polynom b){
        double [] multiply;
        String output = "";
        double mult,pow;
        for (int i = 0; i <= a.getDegree(); i++) {
            for (int j = 0; j <= b.getDegree(); j++) {
                mult = a.getCoefAt(i)*b.getCoefAt(j);
                pow = a.getDegree() - i + b.getDegree() - j;
                output += " +" + mult+"x^"+pow;
            }
            
        }
    return output;
    }
    */
    
   
    
    public static Polynom multiply(Polynom a, Polynom b){
       double array[] = new double[10] ;
       String output = "";
       double mult;
       int pow;
        for (int i = 0; i <= a.getDegree(); i++) {
            for (int j = 0; j <= b.getDegree(); j++) {
                mult = a.getCoefAt(i) * b.getCoefAt(j);
                pow = (a.getDegree()-i) + (b.getDegree()-j);
                array[pow]+= mult; 
            }          
        }
        for (int j = array.length-1; j >= 0; j--) {
                if(array[j]>0){
                    System.out.print(" +"+array[j]+"x^"+j);
                }
            }
        System.out.println("");
        System.out.println("vypsani polynomu------>");
        Polynom c = Polynom.getInstanceReverted(array);
        c.toString();
        
       return c;
    }
    
    
    
    public static void main(String[] args) {
        //Polynom p1 = Polynom.getInstanceReverted(3, 0, 2, 5);
       // Polynom p2 = Polynom.getInstanceReverted(2, 1, 4);
        //System.out.println(sum(p1,p2));
        
        
        Polynom a = Polynom.getInstanceReverted(1,3,5);
        Polynom b = Polynom.getInstanceReverted(2,1,4,4);
        System.out.println(multiply(a,b));
        
        

        
    }
   
}
