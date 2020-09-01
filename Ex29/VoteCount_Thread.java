package Ex29;

import java.util.Random;

public class VoteCount_Thread {
    public static void main(String[] args){
        VoteThread voteThread = new VoteThread();
        VoteThread voteThread1 = new VoteThread();
        VoteThread voteThread2 = new VoteThread();

        Thread location1 = new Thread(voteThread, "Location1");
        Thread location2 = new Thread(voteThread1, "Location2");
        Thread location3 = new Thread(voteThread2, "Location3");

        location1.start();
        location2.start();
        location3.start();

    }
}

class VoteThread implements Runnable{
    int targetNum = 100;
    int sum = 0;
    Random random = new Random();

    public void run(){
        StringBuffer str = new StringBuffer();
        while (true){
            sum = sum + random.nextInt(10);
            str.delete(0,toString().length());

            if(sum >= targetNum){
                sum = 100;
                for(int i = 0; i < sum; i++){
                    str.append("*");
                }
                System.out.println(Thread.currentThread().getName() + " 개표율 : " +
                        sum + "\t" + str);
                break;
            }
            else{
                for(int i = 0; i < sum; i++){
                    str.append("*");
                }
                System.out.println(Thread.currentThread().getName() + " 개표율 : " +
                        sum + "\t" + str);

            }
            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
