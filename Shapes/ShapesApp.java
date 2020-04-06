package cvika4_video2_shapes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author David Bálik
 */

public class ShapesApp {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Shape> shapes = new ArrayList<>();

    public static void main(String[] args) {
        int choise;
        do {
            displayMenu();
            choise = readChoise();
            switch (choise) {
                case 0:
                    break;
                case 1:
                    ClearObjects();
                    break;
                case 2:
                    addSquare();
                    break;
                case 3:
                    addRectangle();
                    break;
                case 4:
                    addCircle();
                    break;
                case 5:
                    printObjects();
                    break;
                case 6:
                    computeArea();
                    break;
                case 7:
                    findWidthMaxArea();
                    break;
                case 8:
                    getObjectInfo();
                    break;
                default:
                    System.out.println("Chybna volba");

            }
        } while (choise != 0);

    }

    private static void displayMenu() {
        System.out.println("");
        System.out.println("1. Nova sada");
        System.out.println("2. Pridej ctverec");
        System.out.println("3. Pridej obdelnik");
        System.out.println("4. Pridej kruh");
        System.out.println("5. Vypis geometricke objekty");
        System.out.println("6. Vypocti celkovou plochu");
        System.out.println("7. Vypis objekt s nejvetsi plochou");
        System.out.println("8. Vypis plochu objektu");
        System.out.println("0. Konec programu");
    }

    private static int readChoise() {
        return sc.nextInt();
    }

    private static void ClearObjects() {
        shapes.clear();
    }

    private static void addSquare() {
        System.out.println("Zadejte delku strany");
        double strana = sc.nextDouble();
        Square s = new Square(strana);
        shapes.add(s);
    }

    private static void addRectangle() {
        System.out.println("Zadejte delku strany");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        Rectangle r = new Rectangle(a, b);
        shapes.add(r);
    }

    private static void addCircle() {
        System.out.println("Vyberte prumer(1) nebo polomer(2)");
        int choice = sc.nextInt();
        double d;
        double r;
        if (choice == 1) {
            System.out.println("Zadej prumer");
            d = sc.nextDouble();
            Circle c = Circle.getInstance(d);
            shapes.add(c);
        } else {
            System.out.println("Zadejte polomer");
            r = sc.nextDouble();
            Circle c = Circle.getInstanceR(r);
            shapes.add(c);
        }

    }

    private static void computeArea() {
        double areaAll = 0;
        for (Shape s : shapes) {
            areaAll += s.area();
        }
        System.out.println(areaAll);
    }

    private static void findWidthMaxArea() {
        double max = Double.MIN_VALUE;
        for (Shape s : shapes) {
            if (s.area() > max) {
                max = s.area();
            }
        }
        System.out.println("Obash nejvetsiho objektu je " + max);
    }

    private static void printObjects() {

        for (int i = 0; i < shapes.size(); i++) {
            System.out.println("Typ: " + (shapes.get(i)).toString() + " obsah: " + shapes.get(i).area());
            
        }
    }

    private static void getObjectInfo() {
        
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(i + ". " +shapes.get(i).toString());
        }
        
        System.out.println("Zadej cislo objektu");
        int on = sc.nextInt(); //object number
           //nevím jak mam udelat aby mi to vypsalo Square{a=3} namisto Rectangle{a=3, b=3} 
   }

}
