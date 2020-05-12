package cvika3_videohovor1;

/**
 *
 * @author David Bálik
 */
public class Fraction {

    //data
    private int numerator;//citatel
    private int denominator; //jmenovatel

    private Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public static Fraction getInstance(int nominator, int denominator){
    return new Fraction(nominator, denominator);
    }

    public int giveDenominator() {
        return denominator;
    }

    public int giveNumerator() {
        return numerator;
    }

    @Override
    public String toString() {
        //String output= "";
        if (numerator == 0) {
            return "0";
        }
        if (denominator == 0) {
            throw new IllegalArgumentException("Cant divide by 0");
        }
        return numerator + "/" + denominator;
    }

    public void simplify() {
        int divisor; //delitel 
        int a = numerator;
        int b = denominator;

        while (b != 0) {
            divisor = b;
            b = a % b;
            a = divisor;
        }

        numerator = numerator / a;
        denominator = denominator / a;
    }

    
    

public static void main (String[] args){
    Fraction f1 = new Fraction(120,60);
    System.out.println(f1.giveNumerator());
    System.out.println(f1.giveDenominator());
    
    f1.simplify();
    System.out.println(f1.giveNumerator());
    System.out.println(f1.giveDenominator());
    System.out.println(f1.toString());
        }




}