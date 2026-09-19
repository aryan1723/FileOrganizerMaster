import java.util.HashMap;
import java.util.Map;

public class ExtensionConfig {
    public static Map<String, String> getMap() {
        Map<String, String> map = new HashMap<>();

        addMapping(map, "Images",
                ".jpg", ".jpeg", ".jpe", ".jfif", ".png", ".gif", ".webp",
                ".bmp", ".tif", ".tiff", ".svg", ".ico", ".heic", ".heif", ".avif",
                ".raw", ".cr2", ".nef", ".arw", ".dng");

        addMapping(map, "Videos",
                ".mp4", ".mkv", ".avi", ".mov", ".wmv", ".flv", ".webm",
                ".m4v", ".mpeg", ".mpg", ".3gp", ".ts", ".mts", ".m2ts");

        addMapping(map, "Audio",
                ".mp3", ".wav", ".flac", ".aac", ".ogg", ".oga", ".m4a",
                ".wma", ".aiff", ".alac", ".opus", ".mid", ".midi");

        addMapping(map, "Documents",
                ".pdf", ".doc", ".docx", ".docm", ".dot", ".dotx", ".txt", ".rtf",
                ".odt", ".ott", ".pages", ".wpd", ".wps", ".csv", ".tsv", ".md",
                ".tex", ".log");

        addMapping(map, "Spreadsheets",
                ".xls", ".xlsx", ".xlsm", ".xlsb", ".xlt", ".xltx", ".ods",
                ".ots", ".numbers");

        addMapping(map, "Presentations",
                ".ppt", ".pptx", ".pptm", ".pps", ".ppsx", ".pot", ".potx",
                ".odp", ".otp", ".key");

        addMapping(map, "Archives",
                ".zip", ".rar", ".7z", ".tar", ".gz", ".bz2", ".xz", ".zst",
                ".tgz", ".tbz2", ".cab", ".iso", ".img", ".dmg");

        addMapping(map, "Code",
                ".java", ".kt", ".kts", ".groovy", ".scala", ".py", ".pyw", ".rb",
                ".php", ".pl", ".sh", ".bash", ".zsh", ".bat", ".cmd", ".ps1",
                ".js", ".jsx", ".ts", ".tsx", ".html", ".htm", ".css", ".scss",
                ".sass", ".less", ".xml", ".xhtml", ".vue", ".svelte", ".c", ".h",
                ".cpp", ".hpp", ".cc", ".cs", ".go", ".rs", ".swift", ".dart",
                ".lua", ".r", ".sql", ".json", ".yaml", ".yml", ".toml", ".ini",
                ".properties", ".gradle", ". Makefile");

        addMapping(map, "Ebooks",
                ".epub", ".mobi", ".azw", ".azw3", ".fb2", ".djvu", ".cbz", ".cbr");

        addMapping(map, "Fonts",
                ".ttf", ".otf", ".woff", ".woff2", ".eot");

        addMapping(map, "Executables",
                ".exe", ".msi", ".apk", ".app", ".deb", ".rpm", ".jar", ".war",
                ".bin", ".run");

        addMapping(map, "DiskImages",
                ".iso", ".img", ".dmg", ".vdi", ".vmdk", ".vhd", ".qcow2");

        return map;
    }

    private static void addMapping(Map<String, String> map, String folder, String... exts) {
        for (String ext : exts) map.put(ext.toLowerCase(), folder);
    }
}
