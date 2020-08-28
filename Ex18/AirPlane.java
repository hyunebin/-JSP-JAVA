package Ex18;

public class AirPlane implements Light,Missile {

    public AirPlane(){
        System.out.println("비행기 입니다.");
        canLight();
        canMissile();
        System.out.println("============");

    }
    @Override
    public void canLight() {
        System.out.println("광선을 쏠 수 있습니다..");
    }

    public void canMissile(){
        System.out.println("미사일을 쏠 수 있습니다.");
    }
}
