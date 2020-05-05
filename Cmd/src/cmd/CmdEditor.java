package cmd;

import java.io.File;

/**
 *
 * @author David Bálik
 */
public class CmdEditor implements CmdInterface {

    private boolean isRunning;
    static private File actualDir; //objekt
    private Command command; //Command = nazev tridy s velkym C

    public CmdEditor() {
        isRunning = true;
        actualDir = new File(System.getProperty("user.dir"));
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }


    @Override
    public String getActualDir() {
        return actualDir.getAbsolutePath();
    }

    @Override
    public String parseAndExecute(String line) {
        //parse
        command = Parser.parse(line);
        //execute
        //isRunning = false;
        return command.execute(actualDir); //vysledkem je String
    }
    
    static public void changeActualDir(File path){
        actualDir = path;
    }
}
