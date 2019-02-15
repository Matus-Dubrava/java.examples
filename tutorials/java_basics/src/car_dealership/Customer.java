package car_dealership;

public class Customer extends Human {

    private double cashOnHand;

    public Customer(String name, String address, double cashOnHand) {
        super(name, address);
        this.cashOnHand = cashOnHand;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
        System.out.println("CUSTOMER");
        System.out.println("name: " + this.getName());
        System.out.println("address: " + this.getAddress());
        System.out.println("cach on hand: " + this.cashOnHand);
        System.out.println();
        System.out.println("is going to buy a car");
        System.out.println();

        vehicle.getDescription();

        System.out.println("from:");

        emp.getDescription();

        emp.handleCustomer(this, finance, vehicle);

        System.out.println();
        System.out.println("Customer cash is: " + this.cashOnHand);
    }
}
