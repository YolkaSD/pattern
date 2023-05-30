package Observer.EventListener;

import java.util.ArrayList;
import java.util.List;

// Интерфейс слушателя
interface ActionListener {
    void actionPerformed(String event);
}

// Источник события
class Button {
    private List<ActionListener> listeners = new ArrayList<>();

    public void addActionListener(ActionListener listener) {
        this.listeners.add(listener);
    }

    public void removeActionListener(ActionListener listener) {
        this.listeners.remove(listener);
    }
    public void click() {
        System.out.println("Кнопка нажата!");
        // Генерация события
        this.listeners.forEach(listener -> listener.actionPerformed("Событие 'click'"));
    }
}

// Конкретный слушатель события
class ButtonClickListener implements ActionListener {

    @Override
    public void actionPerformed(String event) {
        System.out.println("Обработка события: " + event);
    }
}


public class EventListener {
    public static void main(String[] args) {
        Button button = new Button();

        ActionListener listener1 = new ButtonClickListener();
        ActionListener listener2 = new ButtonClickListener();

        button.addActionListener(listener1);
        button.addActionListener(listener2);

        button.click();
    }
}
