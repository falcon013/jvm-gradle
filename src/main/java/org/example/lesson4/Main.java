package org.example.lesson4;

public class Main {
    public static void main(String[] args) {
        // passed by value
        ProgrammingLanguage java = new ProgrammingLanguage(1995);
        System.out.println(java.getReleaseYear()); //1995

        //language is copy of java reference to the object passing as object ProgrammingLanguage
        updateReleaseYear(java, 2022);
        System.out.println(java.getReleaseYear()); //2022

        ProgrammingLanguage swift;
        swift = java;
        updateReleaseYear(swift, 2033);

        System.out.println(swift.getReleaseYear()); // 2033
        System.out.println(java.getReleaseYear()); // 2033


        // passing as Int
        updateReleaseYearInt(java.getReleaseYear(), 2044);
        System.out.println(java.getReleaseYear());//2033

    }
    // passing copy of reference to the object
    public static void updateReleaseYear (ProgrammingLanguage language, int year) {
        language.setReleaseYear(year);
    }
    // vs passing as int

    public static void updateReleaseYearInt (int actualYear, int year) {
        System.out.println(actualYear); //2033

        actualYear = year;

        System.out.println(actualYear); //2044
        System.out.println(year); //2033
    }
}
