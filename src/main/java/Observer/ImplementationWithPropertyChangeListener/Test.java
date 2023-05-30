package Observer.ImplementationWithPropertyChangeListener;

public class Test {
    public static void main(String[] args) {
        PCLNewsAgency observable = new PCLNewsAgency();
        PCLNewsChannel observer1 = new PCLNewsChannel();
        PCLNewsChannel observer2 = new PCLNewsChannel();
        PCLNewsChannel observer3 = new PCLNewsChannel();

        observable.addPropertyChangeListener(observer1);
        observable.addPropertyChangeListener(observer2);
        //observable.addPropertyChangeListener(observer3);

        observable.setNews("News 1 PCL");

        System.out.println(observer1.getNews());
        System.out.println(observer2.getNews());
        System.out.println(observer3.getNews());
    }
}
