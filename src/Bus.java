public class Bus extends Vehicule implements DeliveryGuy {
    // Bus has type
    public String type;

    // Constructor
    public Bus(String brand, int power, String type) {
        super(brand, power);
        this.type = type;
        this.calculateNumberOfPassengers();
    }

    @Override
    public void calculateNumberOfPassengers() {
        this.setNumberOfPassengers(this.type.equals("mini") ? 10 : this.type.equals("maxi") ? 30 : 0);
    }

    @Override
    public void CalculateVignettePrice() {
        System.out.println("Vignette Price is: " + 10 * this.getNumberOfPassengers());
    }

    @Override
    public void deliveryPrice(double startingPoint, double endPoint) {
        System.out.println("Delivery Price is: " + (Math.abs(startingPoint - endPoint) < 100 ? 500 : 700));
    }
}
