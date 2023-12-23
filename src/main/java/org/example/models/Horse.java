package org.example.models;
// Inheritance
public class Horse extends Animal {
    public Horse(Integer age, String name, Integer legs) throws Exception {
        super(age, name, legs);
    }

    @Override
    public void move() {
        System.out.println("Horse jumping...");
    }
    public void sayAnimal() {
        System.out.println("This animal is " + this.name);
    }
}
