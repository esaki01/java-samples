package 基礎.例外処理;

public class Main {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("");
        } catch (NullPointerException | ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
