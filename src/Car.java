// car extends vehicule
public class Car extends Vehicule {
    // Constructor
    public Car(String brand, int power) {
        super(brand, power);
        this.calculateNumberOfPassengers();
    }

    @Override
    public void CalculateVignettePrice() {
        // Calculate vignette price
        // print the vignette price: if power is equal to 60 vignette price is 60 else
        // vignette price is 120.
        // if (this.getPower() == 4) {
        // System.out.println("Vignette price is 60");
        // } else {
        // System.out.println("Vignette price is 120");
        // }
        System.out.println("Vignette price is: " + (this.getPower() == 4 ? 60 : 120));
    }

    @Override
    public void calculateNumberOfPassengers() {
        // if brand is "Jiayun" number of passengers is 2 else number of passengers is
        // 5.
        if (this.getBrand().equals("Jiayun")) {
            this.setNumberOfPassengers(2);
        } else {
            this.setNumberOfPassengers(5);
        }
    }
}