package org.example.lesson1;

public class Variables {
    int a;
    int b;

    String name;
    int age;

    public static int count; // static means that count var is one for all created objects, created just once, belongs to Class, not instance

    @Override
    public String toString() {
        return "Variables{" +
                "a=" + a +
                ", b=" + b +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Variables (String name, int age) {
        this.age = age;
        this.name = name;
        count++;
    }

    public void printCount() {
        System.out.println(count);
    }
}
