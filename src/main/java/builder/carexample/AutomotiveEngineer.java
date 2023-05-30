package builder.carexample;

public class AutomotiveEngineer {
    private CarBuilder carBuilder;

    public AutomotiveEngineer(CarBuilder carBuilder) {
        super();
        this.carBuilder = carBuilder;
        if (this.carBuilder == null) {
            throw new IllegalArgumentException("Automotive Engineer can't work without Car Builder!");
        }
    }

    public Car manufactureCar() {
        return carBuilder.fixChassis().fixBody().paint().fixInterior().build();
    }
}
