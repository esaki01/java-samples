package 基礎.インタフェース;

public class DefaultFoo implements Foo {

    private String message;

    public DefaultFoo(String message) {
        this.message = message;
    }

    @Override
    public String say() {
        return message;
    }
}
