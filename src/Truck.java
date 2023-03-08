public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public void printTruck(){
        System.out.println("License plate: " + getLicensePlate());
        System.out.println("# Of Passengers:" + getPassengers());
        System.out.println("Toll fee:" + getTollFee());
        System.out.println("Number of axles: " +axles );
        System.out.println("Has a truck?" + hasTrailer);
    }

    public boolean validateLicensePlate(){

    }
}