package com.LTIcoding_questions;

public class Identity_Matrix {

    public static boolean isIdentity(int[][] mat){
        int n = mat.length;//square matrix

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i == j && mat[i][j] != 1) || (i !=j && mat[i][j] != 0)) return false;//check 1 and 0 both
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] mat = { {1,0,0},
                        {0,1,0},
                        {0,0,1} };
        System.out.println(isIdentity(mat));
    }
}
