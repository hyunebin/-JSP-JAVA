package Ex23;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args){
        double R = Math.random();
        System.out.println(R);

        Random R2 = new Random();
        int i = R2.nextInt(100);
        System.out.println(i);
    }
}
