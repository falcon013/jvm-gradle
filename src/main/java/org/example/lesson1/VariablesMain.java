package org.example.lesson1;

import java.util.Locale;

public class VariablesMain {
    public static void main(String[] args) {
        Variables variable =  new Variables("Mary", 23);
        System.out.println(variable);
        Variables variable1 =  new Variables("Olga", 67);
        variable.age = 34;
        System.out.println(variable);

        variable.printCount(); // count 1
        variable1.printCount(); // count 2
        System.out.println(variable.toString()); // by default values 0 without initialize in constructor  => Variables{a=0, b=0}
        // with constructor Variables{a=0, b=0, name='Mary', age=23}


// String is immutable, returns new string
        var s = "hello";
        s.toUpperCase();
        System.out.println(s); // hello
        s = s.toUpperCase();
        System.out.println(s); //HELLO

    }
}
