package oop_prereq;

public class Zoo {

    public static void main(String[] args) {
        Bird bird1 = new Bird(2, "M", 4);
        bird1.eat();
        bird1.sleep();

        Chicken chick1 = new Chicken(1, "M", 7);
        Sparrow sparrow = new Sparrow(4, "F", 3);

        sparrow.fly();
        sparrow.move();

        Animal fish = new Fish(10, "M", 20);
        fish.move();
    }
}
