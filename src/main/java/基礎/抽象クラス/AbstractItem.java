package 基礎.抽象クラス;

public abstract class AbstractItem {

    protected String name;

    public AbstractItem(String name) {
        this.name = name;
    }

    public abstract void print(String parentPath);
}
