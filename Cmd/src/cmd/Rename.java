package cmd;

import java.io.File;

/**
 *
 * @author David Bálik
 */
public class Rename extends Command {

    @Override
    public String execute(File actualDir) {
        File f = new File(params[1]); //puvodni
        File newF = new File(params[2]); //nova
        f.renameTo(newF);
        return "File renamed";

    }
}
