
package balik_bank;

import java.util.ArrayList;

/**
 *
 * @author David Bálik
 */
public abstract class Client {
    //data
    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();
    
    public void addAccount(double deposit){
       Account a = new Account(deposit);
       accounts.add(a);
    }
    /*
    vrati mi sumu vsech uctu jednoho uzivatele
    */
    public double giveSumAll(){
        double sum = 0;
        for (Account a : accounts) {
            sum += a.getSum();   
        }
        return sum;
    }
    
    public abstract String getName();
    
    
}
