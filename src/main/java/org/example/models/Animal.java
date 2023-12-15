package org.example.models;

import java.time.LocalDate;
import java.util.Date;

public class Animal {
    // private means is accesible only in class Animal, to change age we need setters ang getters (Encapsulation)
    private Integer age;
    public Integer legs;
    private Integer yob;
    public String name;

    public String xxx;

    public Animal(Integer ageOfAnimal, String name, Integer legsOfAnimal) {
        this.age = ageOfAnimal;
        this.name = name;
        this.legs = legsOfAnimal;

        UpdateYoB(age);
    }

    public Integer getAge() {
        return age;
    }
// logic of setting age encapsulated here in class and change this logic we can only via setter or in constructor
    public void setAge(Integer age) {
        this.age = age;

        UpdateYoB(age);
    }

    public void move() {
        System.out.println("Moving...");
    }

    public Integer getYearOfBirth() {
        return this.yob;
    }

    private void UpdateYoB(Integer age) {
        this.yob = LocalDate.now().getYear() - age;
    }

    public void sayAnimal() {
        System.out.println("This animal is " + this.name);
    }
}
