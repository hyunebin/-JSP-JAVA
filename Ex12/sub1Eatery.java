package Ex12;

public class sub1Eatery extends MainEatery {

    public sub1Eatery(){

    }

    @Override
    public void orderBiBimBap() {
        System.out.println("7000원 입니다.");
    }

    @Override
    public void orderBuDaejjigae() {
        System.out.println("해당 메뉴는 판매하지 않습니다.");
    }

    public void orderGongGiBap(){
        System.out.println("500원 입니다.");
    }

    @Override
    public void orderKimChijjigae() {
        System.out.println("10000원 입니다.");
    }


}
