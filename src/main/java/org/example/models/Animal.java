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

    public Animal(Integer ageOfAnimal, String name, Integer legsOfAnimal) throws Exception {
        // this.age = ageOfAnimal;
        this.name = name;
        this.legs = legsOfAnimal;
        this.setAge(ageOfAnimal);

        UpdateYoB(age);
    }

    public Integer getAge() {
        return age;
    }
// logic of setting age encapsulated here in class and change this logic we can only via setter or in constructor
    public void setAge(Integer age) throws Exception {
        if (age < 0) {
            throw new Exception("Invalid value. Age should be a positive number");
        }

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

    public static void main(String[] args) throws Exception {
        Animal m2 = new Animal(2,"horse", 4);
        System.out.println(m2.age);
    }
}
