package cmd;

import java.io.File;

/**
 * command Exit
 * @author David Bálik
 */
public class Exit extends Command {

    @Override
    public String execute(File actualDir) {
        System.exit(0);
        return " ";
        
    }    
}
