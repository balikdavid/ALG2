/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvika5_video3_comparing_interface;

/**
 *
 * @author David Bálik
 */
public class ComparatorByFirstName implements ComparatorInterface {

    @Override
    public boolean bigger(Object o1, Object o2) {
        return (((Student)o1).getFirstName().compareTo(((Student)o2).getFirstName())>0);
    }
    
}
