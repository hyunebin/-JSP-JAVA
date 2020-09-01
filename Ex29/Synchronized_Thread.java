package Ex29;

public class Synchronized_Thread {
    public static void main(String[] args) {

        ThreadTest4 threadTest = new ThreadTest4();

        Thread thread0 = new Thread(threadTest, "A");
        Thread thread1 = new Thread(threadTest, "B");
        thread0.start();
        thread1.start();

        System.out.println(Thread.currentThread().getName());
        System.out.println("MainClass");

    }
}

class ThreadTest4 implements Runnable {

    int testNum = 0;

    @Override
    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            if(Thread.currentThread().getName().equals("A")) {
                System.out.println("====================================");
                testNum++;
            }
            System.out.println("Thread Name : " + Thread.currentThread().getName() + ", testNum : " + testNum);
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }

}


