
package balik_bank;

/**
 *
 * @author David Bálik
 */
public class Company extends Client {
    private String nameC;

    public Company(String nameC) {
        this.nameC = nameC;
    }
    
    @Override
    public String getName(){
        return "Firma " + nameC;
    }
    

    
    
}
