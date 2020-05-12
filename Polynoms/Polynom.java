
package cvika3_videohovor1;

import java.util.Arrays;

/**
 * immutable = nemenny
 * @author David Bálik
 */
public class Polynom {
    
    //data
    double[] coef;
    
    private Polynom(double[] coef){//defenzivna kopia
    double[] coefTemp = new double[coef.length];
    System.arraycopy(coef, 0, coefTemp, 0, coef.length);
    this.coef = coefTemp;
    
    }
    
    
    //tovarni factory metoda
    public static Polynom getInstanceReverted(double... coef){ //zada jen hodnoty
    return new Polynom(coef);
    }
    
    public static Polynom getInstance(double[] coef){ //[5, 2 ,3 0]
        double[] coefTemp = new double[coef.length];
            for (int i = 0; i < coef.length; i++) {
                coefTemp[coef.length-1-i] = coef[i];
                
            }
            return new Polynom(coefTemp);
    }
    
    //metody
    public int getDegree(){
    return coef.length -1;
    }
    
    
    public double getCoefAt(int exponent){
    return coef[exponent];
    }
    
    public double[] getCoef(){
    return Arrays.copyOf(coef, coef.length); //defenzivni kopie
    }
    
    public Polynom derivate(){
     double[] derivation = new double[coef.length - 1];
        for (int i = 0; i < derivation.length; i++) {
            derivation[i] = coef[i+1]*(i+1);
            
        }
        return new Polynom(derivation);
    
    }
    
   // hodnota polynomu pro x ... pouzit hornerovo schema
    //TODO
    public double computeValueFor(double x){
        //x^2 + 2 ; pre x=3 bude hodnota 11
        double y = 0;
        for (int i = 0; i < coef.length; i++) {
           y = y * x + coef[i]; 
        }
        return y; //musi vracet y
    }
    
    //TODO bonus
    // zjistit integal v urcitem rozpeti, aka vypocitanie urciteho integralu
    
    public double integrate(double a, double b){
        //String out = ""; //output
        double array[] = new double[coef.length];
        double c = 0;
        if(a<b){
        b=c;
        b=a;
        a=c;
        }
        
        for (int i =0; i < coef.length; i--) {
            array[i] = coef.length - i;
            
        }
        double sumA=0, sumB=0;
        for (int i = 0; i < coef.length; i++) {
            sumA +=(coef[i]/array[i])*(Math.pow(a, array[i]));
            sumB +=(coef[i]/array[i])*(Math.pow(b, array[i]));
        }
        
        //for (int i =0; i < coef.length; i++) {
          //  out+= coef[i]+"x^"+array[i]+"/"+array[i]+"  ";
        //}
    return sumA - sumB;
    }
    
    
    //TODO
   //vypsani polynomu
    // nechci 0x atd, 1x vypsat jako x a ne jako 1x
    @Override
   public String toString(){
       String output = "";
        for (int i = coef.length - 1 ;i >=0 ;i--) {
            if (coef[i] != 0) {
                if (coef[i] != 1) {
                    if (coef[i] > 0) {
                        output += "+";
                        
                    }else {
                        output += " ";
                    } 
                    output+=coef[i];
                }
                if (i > 1) {
                    output += "x^" + i + " ";
                    
                } else {
                    if(i == 1){
                        output += "x ";
                    }
                }
                
            }
            
        }
        return output;
   }
   
   
   
   public static void main(String[] args){
       double[] coef = {3, 0, 2, 5};
       Polynom p = Polynom.getInstanceReverted(coef);
       System.out.println(p);
       System.out.println(p.derivate());
       
   
   }
    
}
