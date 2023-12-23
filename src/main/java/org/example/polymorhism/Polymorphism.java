package org.example.polymorhism;

public class Polymorphism {
    public static void main(String[] args){
        Animal obj1 = new Animal();

        Animal h1 = new Horse(); //the object is of Animal type, when a parent class reference is used to refer to a child class object
        System.out.println(h1);
        System.out.println(obj1);

        Horse h2 = new Horse();

        obj1.shout();
        obj1.whatAreYou(); //parent
        // we can call all methods of super class but not sub class methods:

        h1.whatAreYou(); //child
        h1.shout();
        // h1.winRaces(); //*But this is not allowed and throws compile time error,  even though the object is of Animal type.

        h2.winRaces();
        h2.whatAreYou(); //child, even though the object is of Animal type.

    }
}

class Animal {
    public void shout(){
        System.out.println("Parent animal's shout");
    }
    public void whatAreYou() {
        System.out.println("parent");
    }
}

class Horse extends Animal{
    public void shout(){
        System.out.println("Child animal's shout");
    }
    public void winRaces(){
        System.out.println("won race..");
    }
    @Override
    public void whatAreYou() {
        System.out.println("child");
    }
    public void onlyChildrenCanDoThis() {
        System.out.println("Only Children can do this");
    }
}
