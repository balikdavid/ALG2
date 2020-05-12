package cmd;

/**
 *
 * @author David Bálik
 */
public class Parser {

    public static Command parse(String line) { //dir -e .java
        String[] p = line.split(" +"); //(" +") = jedna nebo vice mezer
        //TODO osetrit prazdny prikaz
//        if (p.length == 0) {
//            throw new RuntimeException("  ");
//
//        }

        //p[0] dir; p[1] -e; p[2] .java
        char first = Character.toUpperCase(p[0].charAt(0)); //char na pozici 0
        String name = Command.COMMAND_PACKAGE + "." + first + p[0].substring(1); //k D prida ir == Dir ---> cmd.Dir

        //nepovinne osetrovatelna vyjimka
        try {
            Class c = Class.forName(name);//metoda ktera vytvorila objekt ale neni to konstruktor = tovarni metoda
            Command command = (Command) c.newInstance();
            command.setParams(p);
            return command;
        } catch (Exception e) {
            throw new RuntimeException("Nepodarilo se naparsovat prikaz");
        }
    }
}
