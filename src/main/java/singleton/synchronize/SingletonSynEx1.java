package singleton.synchronize;

// + Простой
// + Лениво инициализируется
// + Даёт возможность обрабатывать исключительные ситуации в конструкторе
// - Синхронизация времязатратное
public class SingletonSynEx1 {
    private static SingletonSynEx1 instance;

    private SingletonSynEx1() {}

    public static synchronized SingletonSynEx1 getInstance() {
        if (instance == null) {
            instance = new SingletonSynEx1();
        }
        return instance;
    }
}
