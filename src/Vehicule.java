public abstract class Vehicule {
    // Vehicule has brand , number of passengers, power.
    private String brand;
    private int numberOfPassengers;
    private int power;

    // Constructor only takes brand and power
    public Vehicule(String brand, int power) {
        this.brand = brand;
        this.power = power;
        this.numberOfPassengers = -1;
    }

    public abstract void calculateNumberOfPassengers();

    public abstract void CalculateVignettePrice();

    // getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
