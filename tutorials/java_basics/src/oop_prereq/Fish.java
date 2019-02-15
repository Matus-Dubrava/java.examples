package oop_prereq;

public class Fish extends Animal {

    public Fish(int age, String gender, int weight) {
        super(age, gender, weight);
    }

    public void swim() {
        System.out.println("Swimming...");
    }

    @Override
    public void move() {
        System.out.println("Fish is swimming...");
    }

}
