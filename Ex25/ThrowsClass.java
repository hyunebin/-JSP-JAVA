package Ex25;

public class ThrowsClass {
    public ThrowsClass(){
        actionC();
    }

    public void actionA() throws  Exception{
        System.out.println("Action A");

        int[] iArr = {1,2,3,4};

        System.out.println(iArr[4]);
    }

    public void actionB(){
        try {
            actionA();
        }catch (Exception e){
            System.out.println("여기서 처리합니다");
            System.out.println(e.getMessage());
        }
    }

    public void actionC(){
        System.out.println("Action C");
        actionB();
        System.out.println("Action CC");
    }
}

class MainClass{
    public static void main(String[] args){
        ThrowsClass throwsClass = new ThrowsClass();
    }
}
