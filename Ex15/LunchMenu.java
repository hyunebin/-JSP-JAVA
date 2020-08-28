package Ex15;

public abstract class LunchMenu {
    protected int rice;
    protected int bulgogi;

    protected int banana;
    protected int milk;
    protected int almond;

    public LunchMenu(int rice, int bulgogi, int banana, int milk, int almond) {
        this.rice = rice;
        this.bulgogi = bulgogi;
        this.banana = banana;
        this.milk = milk;
        this.almond = almond;
    }

    public abstract int calculating();


}
