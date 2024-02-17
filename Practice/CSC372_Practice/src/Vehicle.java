
public class Vehicle {
    private String fuelType;
    private int numDoors;

    public void setFuelType(String fuel) {
        fuelType = fuel;
    }

    public void setNumDoors(int doors) {
        numDoors = doors;
    }
}

public class Truck extends Vehicle {
    private double bedLength;

    public void setBedLength(double length) {
        bedLength = length;
    }
}

