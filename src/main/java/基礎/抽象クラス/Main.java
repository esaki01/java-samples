package 基礎.抽象クラス;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AbstractItem> fileItemList = Arrays.asList(
                new FileItem("fileName1"), new FileItem("fileName2")
        );
        DirectoryItem directoryItem = new DirectoryItem("directory", fileItemList);
        directoryItem.print("parentPath");
    }
}
