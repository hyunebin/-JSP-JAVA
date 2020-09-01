package Ex29;

public class Runnable_Thread {

    public static void main(String[] args){
        ThreadTest threadTest = new ThreadTest();
        Thread thread = new Thread(threadTest, "A");
        thread.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println("MainClass");

    }
}

class ThreadTest implements Runnable{

    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("ThreadTest");

        for(int i = 0; i < 10 ; i++){
            System.out.println(i);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}


