package Ex29;
/*
"C:\Program Files\Java\jdk1.8.0_241\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2019.3.4\lib\idea_rt.jar=5803:C:\Program Files\JetBrains\IntelliJ IDEA 2019.3.4\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_241\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_241\jre\lib\rt.jar;C:\Users\김현빈\IdeaProjects\Ch04\out\production\자바실무" Ex29.Extend_Thread
main // 기본적으로 돌아가는 main 메소드
A // 내가 만든 A thread
ThreadTest // run() 안에있는 Sysout
0
1
2
3
4
5
6
7
8
9
 */

public class Extend_Thread  {
    public static void main(String[] args){
        ThreadTest1 threadTest1 = new ThreadTest1();
        Thread thread = new Thread(threadTest1, "A");
        thread.start();
        System.out.println(Thread.currentThread().getName()); // 현재 구현하고 있는 Thread의 이름을 반환
    }
}

class ThreadTest1 extends Thread{
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
