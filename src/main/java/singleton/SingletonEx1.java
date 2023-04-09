package singleton;

// - Решение подходит исключительно для однопоточных приложений.
public class SingletonEx1 {
    private static SingletonEx1 instance;

    private SingletonEx1(){}

    public static SingletonEx1 getInstance() {
        if (instance == null) {
            instance = new SingletonEx1();
        }
        return instance;
    }
}
