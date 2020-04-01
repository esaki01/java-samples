package ファイル操作;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopySample {
    public static void main(String[] args) {
        Path fromFile = Paths.get("./基礎/ファイル操作/resource/sample.txt");
        Path toFile = Paths.get("./基礎/ファイル操作/resource/sample2.txt");

        try {
            Files.copy(fromFile, toFile);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
