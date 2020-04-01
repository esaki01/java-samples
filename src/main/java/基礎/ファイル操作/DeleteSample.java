package 基礎.ファイル操作;

import java.io.IOException;
import java.nio.file.*;

public class DeleteSample {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/resources/sample2.txt");

        try {
            Files.delete(path);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
