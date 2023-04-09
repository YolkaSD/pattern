package singleton;

// Если конструктор класса не вызывает опасений создания исключительных ситуаций
public class SingletonEx3DemandHolder {
    private SingletonEx3DemandHolder(){}

    private static class SingletonHolder {
        private final static SingletonEx3DemandHolder instance = new SingletonEx3DemandHolder();
    }

    public static SingletonEx3DemandHolder getInstance() {
        return SingletonHolder.instance;
    }
}
