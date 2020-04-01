package 基礎.ファイル操作;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadSample {
    public static void main(String[] args) {
        // バイナリファイル
        Path pathBin = Paths.get("src/main/resources/sample.dat");

        try (InputStream is = Files.newInputStream(pathBin)) {
            for (int ch; (ch = is.read()) != -1;) {
                System.out.println((char) ch);
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }

        // テキストファイル
        Path pathTxt = Paths.get("src/main/resources/sample.txt");

        try (BufferedReader reader = Files.newBufferedReader(pathTxt, StandardCharsets.UTF_8)) {
            for (String line; (line = reader.readLine()) != null;) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
