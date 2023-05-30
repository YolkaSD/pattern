package Observer.newsagence;

import Observer.implementationwithobserver.ONewsAgency;
import Observer.implementationwithobserver.ONewsChannel;

public class Test {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer1 = new NewsChannel();
        NewsChannel observer2 = new NewsChannel();
        NewsChannel observer3 = new NewsChannel();

        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);

        observable.setNews("News 1");
        observable.setNews("News 2");
        observable.setNews("News 3");

        System.out.println(observer1.getNews());
        System.out.println(observer2.getNews());
        System.out.println(observer3.getNews());


    }
}
