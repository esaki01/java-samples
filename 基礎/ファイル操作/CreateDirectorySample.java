package ファイル操作;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectorySample {
    public static void main(String[] args) {
        Path path = Paths.get("./基礎/ファイル操作/resource/newDir");

        try {
            Files.createDirectory(path);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
