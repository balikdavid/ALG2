
package balik_bank;

/**
 *
 * @author David Bálik
 */
public class Person extends Client {
    private String nameP;

    public Person(String nameP) {
        this.nameP = nameP;
    }
    
    @Override
    public String getName(){
        if(nameP.contains("ova")){
            return "Paní "+nameP;
        }
            return "Pán " + nameP;
        
    }
}
