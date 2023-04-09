package singleton;

// + Решение подходит для многопоточных приложений,
// при условии отсутствия опасности возникновения исключительных ситуаций в конструкторе
// и отсутствии необходимости ленивой инициализации

// - Объект instance будет создан classloader-ом во время инициализации класс
// - Отсутствует возможность обработки исключительных ситуаций во время вызова конструктора.
public class SingletonEx2 {
    private static  SingletonEx2 instance = new SingletonEx2();

    private SingletonEx2() {}

    public static SingletonEx2 getInstance() {
        return instance;
    }
}
