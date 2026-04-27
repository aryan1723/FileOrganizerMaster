import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtils {
    public static String getFileExtension(String fileName) {
        int index = fileName.lastIndexOf(".");
        return (index > 0) ? fileName.substring(index).toLowerCase() : "";
    }

    public static
    Path resolveNamingConflicts(Path targetFolder, String fileName) {
        Path destination = targetFolder.resolve(fileName);
        int counter = 1;

        String name = fileName;
        String ext = "";
        int dot = fileName.lastIndexOf('.');
        if (dot > 0) {
            name = fileName.substring(0, dot);
            ext = fileName.substring(dot);
        }

        while (Files.exists(destination)) {
            destination = targetFolder.resolve(name + " (" + counter + ")" + ext);
            counter++;
        }
        return destination;
    }
}
