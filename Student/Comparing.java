
package cvika5_video3_comparing_interface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author David Bálik
 */
public class Comparing {
    public static void main(String[] args) {
        Student[] students = Datasource.loadDataAsArray();
        print(students);
        System.out.println("Sort by number");
        Arrays.sort(students); //Student musi byt typove kompatibilni s Comparable<Student>
        print(students);
        
        
        List<Student> students1 = Datasource.loadDataAsList();
        print(students1);
        System.out.println("Sort by number");
        Collections.sort(students1);
        print(students1);
        
        
    }
  
    
        public static void print(Object[] array){
        for (Object student : array) {
            System.out.println(student);
        }
    }
        
        public static void print(List array){
        for (Object o : array) {
            System.out.println(o);
        }
    }
}
