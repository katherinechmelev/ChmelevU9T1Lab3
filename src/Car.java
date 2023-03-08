public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    public void printCar(){
        System.out.println("License plate: " + getLicensePlate());
        System.out.println("# Of Passengers:" + getPassengers());
        System.out.println("Toll fee:" + getTollFee());
        System.out.println("Is electric? " + electric);
        System.out.println("Discount applied?" + discountApplied);
    }

    public boolean isElectric(){
        return electric;
    }

    public boolean isDiscountApplied(){
        return discountApplied;
    }

    public boolean dropOffPassengers(int numOut){
        int passengers = getPassengers();
        if(numOut<passengers){
            setPassengers(passengers-numOut);
            return true;
        }else{
            return false;
        }
    }
}