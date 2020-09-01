package Ex22;

public class TimeTest {
    public static void main(String[] args){
        System.out.println(System.currentTimeMillis());

        String str = "A";
        long St = System.currentTimeMillis();

        for(int i = 0; i < 50000; i++){
            str += "A";
        }

        long Et = System.currentTimeMillis();

        System.out.println("경과시간 = " + (Et - St));
    }
}
