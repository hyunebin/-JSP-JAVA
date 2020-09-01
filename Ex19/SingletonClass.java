package Ex19;

public class SingletonClass {

    private static SingletonClass SINGLETON_CLASS_INSTANCE = new SingletonClass();
    public int i = 10;

    private SingletonClass() { // private 접근제한자 외부에서 생성할 수 없음 즉 내부에서만 생성가능
        // TODO Auto-generated constructor stub
    }

    public static SingletonClass getSingletonClass() { // 객체가 생성되기 전에 먼저 생성 즉 생성자 역활을 대신하는듯??

        if(SINGLETON_CLASS_INSTANCE == null) { // 외부에서 사용할때 getMethod로 객체를 생성해준다.
            SINGLETON_CLASS_INSTANCE = new SingletonClass();
        }

        return SINGLETON_CLASS_INSTANCE;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

}
