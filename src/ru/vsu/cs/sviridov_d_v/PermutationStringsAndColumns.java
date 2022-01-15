package ru.vsu.cs.sviridov_d_v;

public class PermutationStringsAndColumns {

    public int[][] permutateStringsAndColumns(int [][] arr) {
        int[][] newArray = new int[arr[0].length][arr.length];

        for (int s = 0; s < arr.length; s++) {
            for (int c = 0; c < arr[0].length; c++) {
                newArray[c][s] = arr[s][c];
            }
        }
        return newArray;
    }
}
