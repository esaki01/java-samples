package ファイル操作;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateTempFileSample {
    public static void main(String[] args) {
        Path path = Paths.get("./基礎/ファイル操作/resource/newDir"); // 省略可能

        try {
            Path tempPath = Files.createTempFile(path, "prefix",".tmp");
            System.out.println(tempPath);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
