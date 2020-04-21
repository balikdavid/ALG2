
package cvika5_video3_comparing_interface;


import static cvika5_video3_comparing_interface.MyComparing.sort;
import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

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
        
        int[] array0 = {1,2,1,1,1,2,1,3};
        int[] array1 = {2,2,1,3,1,1,2,3};
        int[] array2 = {1,2,1,3,1,1,2,1};
        students[0].addGrades(array0);
        students[1].addGrades(array1);
        students[2].addGrades(array2);
        print(students);
        System.out.println("Sort by number");
       
        
        Arrays.sort(students);  //Student musi byt typovo kompatibilny s Comparable<Student>
        print(students);
       
        List<Student> students1 = Datasource.loadDataAsList();
        print(students1);
        
        

        
        System.out.println("Sort by name");
         sort(students, new ComparatorByFirstName());
        print(students);
         sort(students, new ComparatorByStudentNumber());
        print(students);
        
        //anonymni trida
        System.out.println("Sort by lastname");
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                Collator col = Collator.getInstance(new Locale("cs","CZ"));
                return col.compare(o1.getLastName(), o2.getLastName());
                
            }
        });
        print(students);
    }
        
    
        public static void print(Student[] array){
        for (Object o : array) {
            System.out.println(o);
        }
    }
        
        public static void print(List array){
        for (Object o : array) {
            System.out.println(o);
        }
    }
}
