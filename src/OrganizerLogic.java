import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class OrganizerLogic {
    private final Path sourcePath;
    private final Path drawerPath;
    private static final Map<String, String> EXTENSION_MAP = ExtensionConfig.getMap();

    public OrganizerLogic(Path sourcePath){
        this.sourcePath = sourcePath;
        this.drawerPath = sourcePath.resolve("FilesDrawer");
    }

    public void organize() throws IOException{
        try(Stream<Path> stream = Files.list(sourcePath)){
            stream.filter(Files::isRegularFile).forEach(this::processFile);
        }
    }

    private void processFile(Path filePath) {
        String fileName = filePath.getFileName().toString();
        String extension = FileUtils.getFileExtension(fileName);
        String targetFolder = EXTENSION_MAP.get(extension);

        if (targetFolder != null) {
            try {
                Path targetDir = drawerPath.resolve(targetFolder);

                // Lazy creation: only creates if file exists
                if (!Files.exists(targetDir)) {
                    Files.createDirectories(targetDir);
                }

                Path destination = FileUtils.resolveNamingConflicts(targetDir, fileName);
                Files.move(filePath, destination);
                System.out.println("Moved " + fileName + " to " + targetFolder);
            } catch (IOException e) {
                System.err.println("Could not move " + fileName + ": " + e.getMessage());
            }
        }
    }
}
