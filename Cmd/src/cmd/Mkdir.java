
package cmd;

import java.io.File;

/**
 *
 * @author David Bálik
 */
public class Mkdir extends Command {
  
@Override
    public String execute(File actualDir) {
        File newFile = new File(params[1]);
        if (!newFile.exists()) {
            try {
                newFile.mkdir();
            } catch (Exception e) {
                throw new RuntimeException("There is a problem with creating the file");
            }
        }

        return "File created";

    }
}