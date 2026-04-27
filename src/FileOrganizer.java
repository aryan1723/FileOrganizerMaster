import java.nio.file.Path;

public class FileOrganizer {
    public static void main(String[] args) {
        Path selectedPath = PathPicker.chooseDirectory();

        if(selectedPath == null){
            System.out.println("Operation Failed");
            return;
        }
        else{
            System.out.println("The selected directory is : "+selectedPath);
        }
    }
}
