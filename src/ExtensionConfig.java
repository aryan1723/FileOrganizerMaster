import java.util.HashMap;
import java.util.Map;

public class ExtensionConfig {
    public static Map<String, String> getMap() {
        Map<String, String> map = new HashMap<>();
        addMapping(map, "Images", ".jpg", ".jpeg", ".png", ".gif", ".webp");
        addMapping(map, "Documents", ".pdf", ".doc", ".docx", ".txt", ".csv");
        addMapping(map, "Archives", ".zip", ".rar", ".7z", ".tar");
        addMapping(map, "Code", ".java", ".py", ".js", ".html", ".cpp", ".json");
        return map;
    }

    private static void addMapping(Map<String, String> map, String folder, String... exts) {
        for (String ext : exts) map.put(ext, folder);
    }
}
