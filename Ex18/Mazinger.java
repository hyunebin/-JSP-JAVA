package Ex18;

public class Mazinger implements Light,Move{

    public Mazinger(){
        System.out.println("마징가 로봇입니다.");
        canLight();
        canMove();
        System.out.println("============");

    }

    @Override
    public void canLight() {
        System.out.println("광선을 쏠 수 있습니다..");
    }

    @Override
    public void canMove() {
        System.out.println("팔과 다리를 움직일 수 있습니다.");
    }
}
