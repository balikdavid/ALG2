
package interfacevariant;

import cvika4_video2_shapes.*;

/**
 *
 * @author David Bálik
 */

//jen imaginarni metoda k prekryti
//predek, ma abstraktni tridy ale muze mit i normalni tridy
public abstract class Shape { //nebudou se z ni vytvaret objekty, jen k prekryti shape je predok
    //data
    protected String name = "Geometric shape"; //protected - data budou videt i v potomcich ... kdybych dal private tak uvidim pouze v dane class
    
    //methods
    public abstract double computeArea(); //kvuli abstract nedavam tride kod, NESMI MIT KOD, musi byt prekryta v potomcich
    
    public String getShapeName(){
        return this.getClass().getSimpleName(); //vrati jmeno daneho objektu, napr u circle vrati "Circle", spolecne pro vsechny potomky
                                                // jen prepouzita v potomcich
    }
    
    @Override
    public String toString(){ //prekryva toString tridy Object, defaultna implementace
        return name + " "+ getShapeName();
    }
    
    
}
