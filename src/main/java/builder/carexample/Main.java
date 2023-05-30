package builder.carexample;

public class Main {
    public static void main(String[] args) {
        CarBuilder sportBuilder = new SportCarBuilder();
        AutomotiveEngineer engineer = new AutomotiveEngineer(sportBuilder);
        Car car = engineer.manufactureCar();
        System.out.println(car);
        CarBuilder classicBuilder = new ClassicCarBuilder();
        engineer = new AutomotiveEngineer(classicBuilder);
        car = engineer.manufactureCar();
    }
}
