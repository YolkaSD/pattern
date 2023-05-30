package Observer.implementationwithobserver;

public class Test {
    public static void main(String[] args) {
        ONewsAgency oObservable = new ONewsAgency();
        ONewsChannel oObserver1 = new ONewsChannel();
        ONewsChannel oObserver2 = new ONewsChannel();
        ONewsChannel oObserver3 = new ONewsChannel();

        oObservable.addObserver(oObserver1);
        oObservable.addObserver(oObserver2);

        oObservable.setNews("News O 1");

        System.out.println(oObserver1.getNews());
        System.out.println(oObserver2.getNews());
        System.out.println(oObserver3.getNews());
    }
}
