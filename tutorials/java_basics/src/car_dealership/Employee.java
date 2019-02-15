package car_dealership;

public class Employee extends Human {

    public Employee(String name, String address) {
        super(name, address);
    }

    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
        System.out.println("EMPLOYEE");
        System.out.println("name: " + this.getName());
        System.out.println("address: " + this.getAddress());
        System.out.println();
        System.out.println("is going to server the customer");

        if (finance) {
            runCreditHistory(cust, vehicle);
        } else if (cust.getCashOnHand() >= vehicle.getPrice()) {
            processTransaction(cust, vehicle);
        } else {
            System.out.println("Customer needs to bring more money");
            System.out.println("Amount missing: " + (cust.getCashOnHand() - vehicle.getPrice()));
            System.out.println();
        }
    }

    public void getDescription() {
        System.out.println("EMPLOYEE");
        System.out.println("name: " + this.getName());
        System.out.println("address: " + this.getAddress());
        System.out.println();
    }

    private void runCreditHistory(Customer cust, Vehicle vehicle) {
        System.out.println("Running credit history: " + vehicle.getPrice());
        System.out.println("Customer received vehicle");
        System.out.println();
    }

    private void processTransaction(Customer cust, Vehicle vehicle) {
        System.out.println("Customer pays the whole price: " + vehicle.getPrice());
        System.out.println("Customer is left with: " + (cust.getCashOnHand() - vehicle.getPrice()));
        System.out.println("Customer received vehicle");
        System.out.println();
        cust.setCashOnHand(cust.getCashOnHand() - vehicle.getPrice());
    }
}
