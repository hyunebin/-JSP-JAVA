package Ex15;

public class Main {

    static final int RICE = 1000;
    static final int BULGOGI = 2000;
    static final int BANANA = 100;
    static final int MILK = 200;
    static final int ALMOND = 300;


    public static void main(String[] args){
        LunchMenu child1 = new child(RICE,BULGOGI,BANANA,MILK,ALMOND);

        System.out.println("1번 아이의 식대는" + child1.calculating());
    }
}
