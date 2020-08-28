package Ex18;

public class PoohToy implements Move {
    public PoohToy(){
        System.out.println("곰돌이 인형입니다.");
        canMove();
        System.out.println("============");
    }
    @Override
    public void canMove() {
        System.out.println("팔과 다리를 움직일 수 있습니다.");
    }
}
