import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        Files.readAllLines(Path.of("C:\\Users\\I\\Desktop\\test.txt")).forEach(System.out::println);
    }
}
