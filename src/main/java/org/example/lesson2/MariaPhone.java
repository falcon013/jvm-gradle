package org.example.lesson2;

public class MariaPhone extends iPhone {
    @Override
    public void move() {
        System.out.println("Moving...");
    }

    @Override
    public void dance() {
        System.out.println("Dancing...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking...");
    }
}
