package balik_bank;

/**
 *
 * @author David Bálik
 */
public class Account {

    private double sum; //kolik mam na uctu

    //constructor
    public Account(double sum) {
        this.sum = checkSum(sum);
    }

    @Override
    public String toString() {
        return "Mate na ucte " + sum + " Kc";
    }

    private double checkSum(double sum) {
        if (sum < 0) {
            throw new IllegalArgumentException("Number of money must be >= 0");
        }
        return sum;
    }

    public void giveMoney(double money) {
        this.sum += money;
    }

    public void getMoney(double money) {
        this.sum -= money;
    }

    public double getSum() {
        return sum;
    }

    public static void main(String[] args) {
        Account a = new Account(6);
        System.out.println(a.toString());

    }
}
