package org.example4;

import java.util.ArrayList;

public class AmusementParkRide {
    private String name;
    private int lowestHeight;
    private int visitors;
    private ArrayList<Person> riding;

    public AmusementParkRide(String name, int lowestHeight) {
        this.name = name;
        this.lowestHeight = lowestHeight;
        this.visitors = 0;
        this.riding = new ArrayList<>();

    }

    public boolean allowedToRide(Person person) {
        if (person.getHeight() < this.lowestHeight) {
            return false;
        }

        this.visitors++;
        this.riding.add(person);
        return true;
    }

    public String toString() {
        String onTheRide = "";
        for (Person person: riding) {
            onTheRide = onTheRide + person.getName() + "\n";
        }
        return this.name + ", minimum height requirement: "  +
                ", visitors: " + this.visitors + "\n" +
                "riding:\n" + onTheRide;
    }
}
 class Person {

    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name) {
        this(name, 0);
    }

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }
     public String getName() {
         return this.name;
     }


     public int getHeight() {
        return this.height;
    }

    public void growOlder() {
        this.age = this.age + 1;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
}

class Main {
    public static void main(String[] args) {
        Person matt = new Person("Matt");
        matt.setHeight(180);

        Person jasper = new Person("Jasper");
        jasper.setHeight(132);

        AmusementParkRide waterTrack = new AmusementParkRide("Water track", 140);

        if (waterTrack.allowedToRide(matt)) {
            System.out.println(matt.getName() + " may enter the ride");
        } else {
            System.out.println(matt.getName() + " may not enter the ride");
        }

        if (waterTrack.allowedToRide(jasper)) {
            System.out.println(jasper.getName() + " may enter the ride");
        } else {
            System.out.println(jasper.getName() + " may not enter the ride");
        }

        System.out.println(waterTrack);
    }

}