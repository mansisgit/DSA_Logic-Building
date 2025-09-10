package com.LTIcoding_questions;

public class Kadans_Algo {
    //largest sum subarray ---> sequence is important
    public static int maxSumSubarray(int[] arr){
        int maxSoFar = arr[0],currSum = arr[0];

        for(int i =1;i<arr.length;i++){
            currSum = Math.max(arr[i],currSum+arr[i]);
            maxSoFar = Math.max(maxSoFar,currSum);
        }
        return maxSoFar;
    }



    public static void main(String[] args) {
        int[] arr = {-1,2,3,4,-5,6,-7,7};
        System.out.println(maxSumSubarray(arr));
    }

}
