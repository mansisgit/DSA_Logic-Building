package com.LTIcoding_questions;

import java.util.Arrays;

public class SpiralMatrix {

    public static void spiral(int[][] mat) {
        int left = 0, top = 0, right = mat[0].length - 1, bottom = mat.length - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                System.out.print(mat[top][i]+",");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(mat[i][right]+",");
            }
            right--;

            if(bottom>=top) {
                for (int i = right; i >= left; i--) {
                    System.out.print(mat[bottom][i] + ",");
                }
                bottom--;
            }
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(mat[i][left] + ",");
                }
                left++;
            }

        }
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},
                {5,6,7,8},{9,10,11,12}};

        spiral(mat);
    }

}
