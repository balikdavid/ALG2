package cmd;

import java.io.File;

/**
 * command Help
 * @author David Bálik
 */
public class Help extends Command{

    @Override
    public String execute(File actualDir) {
        String help = "Help\n"
                + String.format("%-7s %s\n", "help", "Display help") // \n = novy radek | %- = zarovnani vlevo
                + String.format("%-7s %s\n", "dir", "Display list of files and folders");
         return help;
    } 
}
