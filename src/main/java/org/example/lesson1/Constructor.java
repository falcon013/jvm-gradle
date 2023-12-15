package org.example.lesson1;

public class Constructor {
    int i;
    float f;

    //Polymorphism (many behaviours)  constructor overloading when we have multiple constructors,
    //the same about methods overloading with the same name show() and show (int k)
    public Constructor() {
        i= 5;
        f= 5.5F;
        System.out.println("This is default constructor");
    }
    public Constructor(int k) {
        i = k;
        System.out.println("This is another constructor with params");
    }
}
