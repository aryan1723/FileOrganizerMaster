import javax.swing.*;
import java.nio.file.Path;

public class PathPicker {
    public static Path chooseDirectory(){
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Select Directory to be sorted");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int return_val = chooser.showOpenDialog(null);
        if(return_val == JFileChooser.APPROVE_OPTION){
            return chooser.getSelectedFile().toPath();
        }
        return null;
    }
}
