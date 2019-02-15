package oop_prereq;

public abstract class Animal {

    private int age;
    private String gender;
    private int weight;

    public Animal(int age, String gender, int weight) {
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void eat() {
        System.out.println("eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    public abstract void move();
}
