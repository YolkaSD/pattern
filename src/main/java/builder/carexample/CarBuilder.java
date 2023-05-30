package builder.carexample;

public interface CarBuilder {
    CarBuilder fixChassis();
    CarBuilder fixBody();
    CarBuilder paint();
    CarBuilder fixInterior();
    Car build();
}
