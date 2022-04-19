
public class Taxi extends Vehicule implements DeliveryGuy {

    // Taxi has DeliveryUnitPrice and RoadTax
    private double deliveryUnitPrice;
    private double roadTax;

    // constructor
    public Taxi(String brand, int power, double deliveryUnitPrice, double roadTax) {
        super(brand, power);
        this.deliveryUnitPrice = deliveryUnitPrice;
        this.roadTax = roadTax;
        this.calculateNumberOfPassengers();
    }

    public Taxi(String brand, int power) {
        super(brand, power);
        this.deliveryUnitPrice = 0;
        this.roadTax = 0;
        this.calculateNumberOfPassengers();
    }

    @Override
    public void calculateNumberOfPassengers() {
        this.setNumberOfPassengers(5);
    }

    @Override
    public void CalculateVignettePrice() {
        System.out.println("Vignette price is: " + 12 * roadTax);
    }

    @Override
    public void deliveryPrice(double startingPoint, double endingPoint) {
        System.out.println("Delivery price is: " + Math.abs(startingPoint - endingPoint) * deliveryUnitPrice);
    }
}
