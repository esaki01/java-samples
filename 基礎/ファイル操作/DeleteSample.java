package ファイル操作;

import java.io.IOException;
import java.nio.file.*;

public class DeleteSample {
    public static void main(String[] args) {
        Path path = Paths.get("./基礎/ファイル操作/resource/sample2.txt");

        try {
            Files.delete(path);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
