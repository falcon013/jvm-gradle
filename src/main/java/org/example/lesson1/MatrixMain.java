package org.example.lesson1;

public class MatrixMain {
    public static void main(String[] args) {

        Matrix matrix = new Matrix(3);

        var getAtVal = matrix.getAt(0,1);
        System.out.println(getAtVal);

        matrix.setAt(1,2,6);

        getAtVal = matrix.getAt(1,2);
        System.out.println(getAtVal);

    }
}
