package car_dealership;

public class Vehicle {

    private String type;
    private String color;
    private double price;

    public Vehicle(String type, String color, double price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void getDescription() {
        System.out.println("CAR");
        System.out.println("type: " + this.type);
        System.out.println("color: " + this.color);
        System.out.println("price: " + this.price);
        System.out.println();
    }
}
