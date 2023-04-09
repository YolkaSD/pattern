package singleton.synchronize;

//Double-Checked Locking

public class SingletonSynEx2 {
    private static SingletonSynEx2 instance;

    private SingletonSynEx2() {}

    public static SingletonSynEx2 getInstance() {
        if (instance == null) {
            synchronized (SingletonSynEx2.class) {
                if (instance == null) {
                    instance = new SingletonSynEx2();
                }
            }
        }
        return instance;
    }
}
