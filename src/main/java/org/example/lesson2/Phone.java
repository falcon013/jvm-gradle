package org.example.lesson2;

abstract class Phone {
    public void call() {
        System.out.println("Calling...");
    }
    public abstract void move(); // abstract methods
    public abstract void dance();
    public abstract void cook();

    public abstract void sendMessage(); // abstract method
}
