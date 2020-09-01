package Ex29;

public class ObjectSigle_N_Thread {
    public static void main(String[] args){
    ThreadTest2 threadTest2 = new ThreadTest2();

    Thread thread = new Thread(threadTest2, "A");
    Thread thread1 = new Thread(threadTest2,"B");
    thread.start();
    thread1.start();
    }
}

class ThreadTest2 implements Runnable{
    int num = 0;
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            if(Thread.currentThread().getName().equals("A")){
                System.out.println("==========================");
                num++;
            }
            System.out.println("Thread Name : " + Thread.currentThread().getName() + ", Num : "
                    + num);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
