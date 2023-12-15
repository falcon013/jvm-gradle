package org.example2;

import java.util.Arrays;

public class Algorithms {
    public int[] codes;
    int i;
    int j;

    public Algorithms (int [] c) {
        this.codes = c;
    }

    @Override
    public String toString() {
        return "Algorithms{" +
                "codes=" + Arrays.toString(codes) +
                ", i=" + i +
                ", j=" + j +
                '}';
    }

    public Algorithms() {

    }

    public void getNums (int[] c) {
        for (int i: c) {
            System.out.println(i);
        }
    }
}
