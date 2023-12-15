package org.example.models;

public class Cat extends Animal {
    public Cat(Integer age, String name, Integer legs) {
        super(age, name, legs);
    }

    @Override
    public void move() {
        System.out.println("Cat walking...");
    }
}
