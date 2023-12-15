package org.example.collections;

public class Arrays {
    static int i = 5; // on the class level
    int j;
    int k = 1000;

    @Override
    public String toString() {
        return "Arrays{" +
                "j=" + j +
                ", k=" + k +
                ", arr=" + java.util.Arrays.toString(arr) +
                ", nestedArr=" + java.util.Arrays.toString(nestedArr) +
                '}';
    }

    int [] arr = {1,2,3};
    int [][] nestedArr  = {{1,3,5},{7,8,9}};

    Arrays() {
    }

    static void staticMethod () {
        i = 7;
        System.out.println(i); // can access only static var
    }
}
