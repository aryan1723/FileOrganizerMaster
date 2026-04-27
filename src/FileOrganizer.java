import javax.swing.*;
import java.io.IOException;
import java.nio.file.Path;

public class FileOrganizer {
    public static void main(String[] args) {
        Path selectedPath = PathPicker.chooseDirectory();

        if(selectedPath == null){
            System.out.println("Operation Failed");
            return;
        }

        try {
            OrganizerLogic logic = new OrganizerLogic(selectedPath);
            logic.organize();
            JOptionPane.showMessageDialog(null, "Organization Complete!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
