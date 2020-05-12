/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hurricane;

import java.util.Scanner;

/**
 *
 * @author David Bálik
 */
public class HurricaneUI {

   
    public static void main(String[] args) {
        HurricaneInterface hI = new DataEditor();
       Scanner sc = new Scanner(System.in);
       int yearStart, yearEnd;
       String hurricane;
       
       try{
            hI.load();
        }catch(Exception e){
            System.out.println("Neplatny soubor");
        }
        System.out.println("Vypis informace o hurikanech v danem obdobi");
        System.out.println("Zadejte od ktereho roku");
        yearStart = sc.nextInt();
        System.out.println("Zadejte do ktereho roku");
        yearEnd = sc.nextInt();
        System.out.println(hI.hurricanesInYears(yearStart, yearEnd));
        System.out.println("--------------------------------------------------------------");
        
        System.out.println("Vypis kategorie a rychlosti zadaneho hurikanu");
        hurricane = sc.next();
        System.out.println(hI.hurricaneByName(hurricane));
        System.out.println("--------------------------------------------------------------");
        
        System.out.println("Vypis informaci o hurikanech setridenych podle rychlosti");
        System.out.println(hI.hurricaneInfoBySpeed());
    }
    
}
