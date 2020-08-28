package Ex12.Super;

public class ChildrenClass extends ParentClass{

    public ChildrenClass(){
        System.out.println("자식");
    }

    @Override
    public void method1() {
        super.method1();

        System.out.println("자식 클래스의 메소드 1입니다.");
    }
}
