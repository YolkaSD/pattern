package Observer.EventListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        // setLookAndFeel - метод класса UIManager, который позволяет установить внешний вид приложения.
        // getSystemLookAndFeelClassName() класса UIManager, который возвращает имя класса внешнего вида,
        // соответствующего системному стилю операционной системы.
        // Устанавливает внешний вид (Look and Feel) приложения в соответствие с системным стилем операционной системы, на которой запущено приложение.
        // Установка системного внешнего вида не является обязательной частью программы.
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Пример слушателя событий");
        JButton button = new JButton("нажми на меня");

        // Создание слушателя событий
        //ActionListener listener = e -> System.out.println("Кнопка была нажата");
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Кнопка была нажата");
            }
        };
        // Регистрация слушателя событий на кнопке
        button.addActionListener(listener);

        // Настройка стилей кнопки
        // Цвет фона кнопки
        button.setBackground(Color.WHITE);
        // Цвет текста кнопки
        button.setForeground(Color.BLACK);
        // Стиль текста кнопки
        button.setFont(new Font("Arial", Font.BOLD, 16));
        // Линейная граница кнопки
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        // Расположение окна по центру монитора
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
