package org.example;

import org.example.lesson1.Constructor;
import org.example.lesson1.Copy;
import org.example.lesson1.Matrix;
import org.example.lesson2.MariaPhone;
import org.example.lesson2.NataliaPhone;
import org.example.lesson3.Person;
import org.example.models.Animal;
import org.example.models.Cat;
import org.example.models.Horse;

public class Main {
    public static void main(String[] args) throws Exception {
        Animal myAnimal = new Animal(15, "Vasya", 4);

        myAnimal.name = "Kitty";
        myAnimal.legs = 8;
        System.out.println(myAnimal.xxx);
        System.out.printf("My animal age is: %s and name: %s and legs: %s\n", myAnimal.getAge(), myAnimal.name, myAnimal.legs);
// Inheritance all features from Animal goes to Horse, Dog...
        Horse h = new Horse(43,"Mary", 4);

// Encapsulation (get set methods to change values), inheritance
        Cat c =  new Cat(22, "Musya", 4);
        

        System.out.println(c.getYearOfBirth()); // 2000
        c.setAge(43);
        Integer y = c.getAge(); //43
        System.out.println(y);
        System.out.println(c.getYearOfBirth()); // 1979

       // iPhone iPhoneInstance = new iPhone(); // you can not instantiate the abstract class
       // iPhoneInstance.call();

 //Abstract class, polymorphism
        MariaPhone mPhone = new MariaPhone();
        mPhone.sendMessage(); //Sending iMessage...


        NataliaPhone nPhone = new NataliaPhone();
        nPhone.sendMessage(); //Sending SMS...

        // everything in Java passed by value (create copy of primitive type or copy of memory address),
        // when we pass object we create copy of obj reference to the address in memory pointing to original object {John, 21}

        Person person1 = new Person("John", 21);

        Person person2;

        person2 = person1;

        person2.changeDetails("Mary", 33);

        System.out.println(person1); //name:Mary age:33

 // PolyMorphism (multi behaviour)

// overloading one method with diff params
        Constructor obj1IsReference = new Constructor(); //This is default constructor
        Constructor obj2IsReference = new Constructor(66); //This is another constructor with params
// overriding
        h.sayAnimal(); // Mary
        myAnimal.sayAnimal(); //Kitty
        c.move(); //Cat walking...
        h.move(); //Horse jumping...


// Shallow object copy (one reference to the same object:
        Copy obj1 = new Copy(500, 800);
        obj1.a = 100;
        obj1.b = 200;
        System.out.println(obj1); //Copy{a=100, b=200}

        Copy obj2 = obj1;
        obj2.a = 300;
        System.out.println(obj2);  // Copy{a=300, b=200} or Copy{a=1000, b=2000} without shallow copy obj2 = obj1
        System.out.println(obj1); // Copy{a=300, b=200}

        Copy obj3 = new Copy(3000, 6000);
        System.out.println(obj3); // Copy{a=3000, b=6000} or without constructor Copy{a=null, b=null}

 //Deep copy (2 different references) Cloning

        Copy obj4 = new Copy(7, 7);

        Copy obj5 = obj4.clone();
        obj4.a = 3333333;

        System.out.println(obj4); //Copy{a=3333333, b=7}
        System.out.println(obj5); //Copy{a=7, b=7}

 // Arrays
        int[] nums = new int[5];

        String[] strings = new String[2];
        strings[0] = "hello";
        strings[1] = "Mary";
        for (String s: strings) {
//            System.out.println(s);
        }

        int[] numbers = {1,2,3};
        for (int i=0; i<numbers.length; i++){
//            System.out.println(numbers[i]);
        }

        int i = 20;
        int j = i;
        j++; // will not affect i

        System.out.printf("value of i and j after modification i: %d, j: %d %n", i, j); //value of i and j after modification i: 20, j: 21

        Matrix m1 = new Matrix(8);
        System.out.println(m1.getAt(1,1));


    }
}
