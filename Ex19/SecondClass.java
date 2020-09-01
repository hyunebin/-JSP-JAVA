package Ex19;



public class SecondClass {
    public SecondClass() {
        SingletonClass singletonClass = SingletonClass.getSingletonClass();
        System.out.println("SecondClass");
        System.out.println("i = " + singletonClass.getI());
    }
}

