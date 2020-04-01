package 基礎.ファイル操作;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopySample {
    public static void main(String[] args) {
        Path fromFile = Paths.get("src/main/resources/sample.txt");
        Path toFile = Paths.get("src/main/resources/sample2.txt");

        try {
            Files.copy(fromFile, toFile);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
