package Singletone;

public class Main {

    public static void main(String[] args) {
        FirstClass firstClassObj = new FirstClass(3, "Third", "Some class to test the .classLogg()");
        SecondClass secondClassObj = new SecondClass(4, "Fourth", "this could be your ad");
        SomeOtherClass someOtherClass = new SomeOtherClass();

        SingletonLogger singletonLogger = SingletonLogger.getInstance();
        singletonLogger.classLogg(someOtherClass);

    }
}
