//Design N-by-N matrix class with 2 public functions
//-getAt(i, j) => return a number at row i and col j
//-setAt(i,j,value) => set a number v at row i and col j
//There are no other public funcs (except • constructor which • takes • in N)
//When matrix is created we know all values are 0
//There are only a few non zero elements, at most
//i=5, j=5, value=5

package org.example.lesson1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Matrix {
    private int [][] data;
    Matrix v;

    public Matrix ( int n) {
        this.data = new int[n][n];
    }

    public void setAt (int row, int col , int value) {
        this.data[row][col] = value; // this to address field data in object matrix of Class Matrix
    }
    public int getAt (int row, int col) {
        return this.data[row][col];
    }

}
