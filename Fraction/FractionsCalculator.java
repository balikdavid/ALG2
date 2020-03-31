package cvika3_videohovor1;

import java.util.logging.Logger;

/**
 *
 * @author David Bálik
 */
public class FractionsCalculator {

    public static int minMultiple(int a, int b) {
        if (a != b) {
            for (int i = 1; i < a * b; i++) {
                if ((a * i) % b == 0) {
                    return a * i;
                }

            }
        }
        return a;
    }

   
    
     public static Fraction add(Fraction a, Fraction b){
         int spolJmen, spolCit;                     
         int aDen = a.giveDenominator();            
         int aNum = a.giveNumerator();                        
         int bNum = b.giveNumerator();              
         int bDen = b.giveDenominator();            
         
         spolJmen = minMultiple(aDen,bDen);
         spolCit = ((spolJmen/aDen)*aNum)+((spolJmen/bDen)*bNum);
         
         return Fraction.getInstance(spolCit, spolJmen);
          
    }
     
      public static Fraction subtraction(Fraction a, Fraction b){
          int spolJmen, spolCit;                     
         int aDen = a.giveDenominator();            
         int aNum = a.giveNumerator();                        
         int bNum = b.giveNumerator();              
         int bDen = b.giveDenominator();            
         
         spolJmen = minMultiple(aDen,bDen);
         spolCit = ((spolJmen/aDen)*aNum) - ((spolJmen/bDen)*bNum);
         
         return Fraction.getInstance(spolCit, spolJmen);
          
    }
      
      
      public static Fraction multiply(Fraction a, Fraction b){
         int jmenovatel, citatel;
         int aDen = a.giveDenominator();            
         int aNum = a.giveNumerator();                        
         int bNum = b.giveNumerator();              
         int bDen = b.giveDenominator();
         
         citatel = aNum * bNum;  
         jmenovatel = aDen * bDen;
         
         return Fraction.getInstance(citatel, jmenovatel);
         
      }
      
      
      public static Fraction divide(Fraction a, Fraction b){
         int jmenovatel, citatel;
         int aDen = a.giveDenominator();            
         int aNum = a.giveNumerator();                        
         int bNum = b.giveNumerator();              
         int bDen = b.giveDenominator();
         
         citatel = aNum*bDen;
         jmenovatel = aDen * bNum;
         
          return Fraction.getInstance(citatel, jmenovatel);
      }
     
     
   
    
    
    public static void main(String[] args) {
        //System.out.println(minMultiple(3, 3));
        Fraction f = Fraction.getInstance(4, 3);
        Fraction g = Fraction.getInstance(5,10);
        System.out.println(minMultiple(4,4));
        //scitani
        Fraction h = add(f,g);
        h.simplify();
        System.out.println(h);
        
        //odecitani
       Fraction o = subtraction(f,g);
       o.simplify();
       System.out.println(o.toString());
       //nasobeni
       Fraction m = multiply(f,g);
       m.simplify();
        System.out.println(m);
       //deleni
       Fraction d = divide(f,g);
       d.simplify();
        System.out.println(d);
       
       
        

    }

}
