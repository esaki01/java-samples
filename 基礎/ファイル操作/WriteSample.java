package ファイル操作;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteSample {
    public static void main(String[] args) {
        // バイナリファイル
        Path pathBin = Paths.get("./基礎/ファイル操作/resource/sample.dat");
        byte[] data = new byte[]{0x41, 0x42, 0x43};

        try (OutputStream stream = Files.newOutputStream(
                pathBin, StandardOpenOption.APPEND, StandardOpenOption.CREATE, StandardOpenOption.WRITE
        )) {
            stream.write(data);
        } catch (IOException ex) {
            System.err.println(ex);
        }

        // テキストファイル
        Path pathTxt = Paths.get("./基礎/ファイル操作/resource/sample.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(pathTxt, StandardCharsets.UTF_8)) {
            writer.append("test");
            writer.newLine();
            writer.append("test2");
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
