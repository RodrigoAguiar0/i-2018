import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Atividade2 {

    public static void main(String[] args) {
        Path path = Paths.get(args[0]);
        byte[] bytes = new byte[0];
        StringBuilder bytesHexa = new StringBuilder();
        try {
            bytes = Files.readAllBytes(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
