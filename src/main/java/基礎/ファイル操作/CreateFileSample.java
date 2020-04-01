package 基礎.ファイル操作;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFileSample {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/resources/new.dat");

        try {
            Files.createFile(path);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
