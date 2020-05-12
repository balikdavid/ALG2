
package balik_bank;

import java.util.ArrayList;

/**
 *
 * @author David Bálik
 */
public class Main {

    public static ArrayList<Client> clients = new ArrayList<>();
    
    public static void main(String[] args) {
        //1
       Person pekar = new Person("Pekar");
       Person svecova = new Person("Svecova");
       Company skoda = new Company("Skoda");
       
       clients.add(pekar);
       clients.add(svecova);
       clients.add(skoda);
       //2
       pekar.addAccount(1000);
       pekar.addAccount(500);
       
       svecova.addAccount(1200);
       
       skoda.addAccount(120);
       
       //3
        System.out.println(clients.get(0).getName() + " castka je: " + clients.get(0).giveSumAll());
        System.out.println(clients.get(1).getName() + " castka je: " + clients.get(1).giveSumAll());
        System.out.println(clients.get(2).getName() + " castka je: " + clients.get(2).giveSumAll());
    }
    
}
