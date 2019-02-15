package car_dealership;

public class Dealership {

    public static void main(String[] args) {
        Customer cust1 = new Customer("Tom", "123 Anything St.", 12000);
        Vehicle veh1 = new Vehicle("Opel Vectra", "blue", 20000);
        Employee emp1 = new Employee("Sue", "123 Some St.");

        cust1.purchaseCar(veh1, emp1, false);
    }
}
