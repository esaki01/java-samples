package 匿名クラス;

public class Main {
    public static void main(String[] args) {
        TaskHandler taskHandler = new TaskHandler() {
            @Override
            public void handle() {
                System.out.println("Task handle.");
            }
        };

        taskHandler.handle();
    }
}
