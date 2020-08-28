package Ex12;

public class main {
    public static void main(String[] args){
        MainEatery Bonsa = new MainEatery();
        MainEatery sub = new sub1Eatery();

        Bonsa.orderBiBimBap();;
        Bonsa.orderBuDaejjigae();
        Bonsa.orderGongGiBap();

        sub.orderBuDaejjigae();
        sub.orderBiBimBap();
        sub.orderGongGiBap();
    }
}
