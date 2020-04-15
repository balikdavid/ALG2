
package cvika5_video3_comparing_interface;

import java.util.Scanner;

/**
 *
 * @author David Bálik
 */
public class Student implements CompareInterface, Comparable<Student/*s cim se bude porovnavat */>{
    
   
    //data
    private String firstName;
    private String lastName;
    private int age;
    private int number;
    private int[] grades; //todo max 10 znamek
    final private int numberOfGrades = 10;
    private double average; //todo
    

    public Student(String firstName, String lastName, int number,int age ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.number = number;
        grades = new int[numberOfGrades];
        for (int i = 0; i < numberOfGrades; i++) {
            grades[i] = -1;
            
        }
        
    }

      @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", number=" + number + ", grades=" + getGrades() + ", average=" + String.valueOf(getAverage()) + '}';
    }
    
    
    
    
    private String getGrades() {
        String returnValue = "";
        for (int i = 0; i < numberOfGrades; i++) {
            if (i == 0) {
                if (this.grades[i] != -1) {
                    returnValue += this.grades[i];
                }
            } else {
                if (this.grades[i] != -1) {
                    returnValue += "," + this.grades[i];
                }
            }
        }
        return returnValue;
    }

       private double getAverage() {
        double returnValue = 0;
        int counter = 0;
        for (int i = 0; i < numberOfGrades; i++) {
            if (this.grades[i] != -1) {
                returnValue += this.grades[i];
                counter++;
            }
        }
        return this.average = returnValue / counter;

    }
        
    
    boolean startLater(Student student){
        return this.number > student.number;
    }

    @Override
    public boolean isSmaller(CompareInterface o) {
        return this.number > ((Student)o).number;
    }

//    @Override
//    public int compareTo(Object o) { // vraci zaporne, nulu, nebo kladne
//         return this.number - ((Student)o).number;
//    }


         @Override
    public int compareTo(Student o) { //genericita, umoznuje doplnit typy objektu, ktere se porovnavaji
        if((this.average - o.average)>0){
            return 1;
        }
        else if((this.average - o.average)<0){
            return -1;
        }
        else{
            return 0;
        }
    }

    
    public void addGrades(int[] grades){
        for (int i = 0; i < grades.length; i++) {
            if (i < numberOfGrades) {
                this.grades[i] = grades [i];
                
            } 
        }
    }
    
    public void addGrade(int grade){
        for (int i = 0; i < numberOfGrades; i++) {
            if (grades[i] == -1) {
                grades[i] = grade;
                
            }
        }
    }
    
    
    //TODO
    /*
    dodelat pole znamek, vypocitat prumer
    umoznit pridavat studentovi znamky - metoda
    vypocitat prumer metoda;
    zmenit metodu compareTo, aby se tridilo podle prumeru (pozor prumer je double) -1,0,1
    */
}
