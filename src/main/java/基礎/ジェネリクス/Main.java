package 基礎.ジェネリクス;

public class Main {
    public static void main(String[] args) {
        GenericStack<String> genericStack = new GenericStack<>();

        // genericStack.push(true); エラー
        genericStack.push("Java");
        genericStack.push("Scala");
    }
}
