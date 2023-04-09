package singleton.synchronize;

// - volatile модификатора может привести к проблемам производительности на мультипроцессорных системах
public class SingletonSynEx3 {
    private static volatile  SingletonSynEx3 instance;

    private SingletonSynEx3(){}

    public static SingletonSynEx3 getInstance() {
        if (instance == null) {
            synchronized (SingletonSynEx3.class) {
                if (instance == null) {
                    instance = new SingletonSynEx3();
                }
            }
        }
        return instance;
    }
}
