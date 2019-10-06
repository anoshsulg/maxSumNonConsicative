package com.asulg.arr;

public class MaxSumNonAdjecent {

    public static void main(String[] arr){
        System.out.println("MaxSumNonAdjecent");

        int[] target = { 10, 11, 4, 5, 6, 4, 22, 5, 12};
        for( int i : target){
            System.out.println("" + i);
        }

        // count of sets that addup to sum


        System.out.println(" " + maxNASum(target, target.length - 1));

    }


    public static int maxNASum(int[] arr, int i ){
        int acc = 0;
       if(i == 0 ) {
            acc = arr[0];
        }  else if(i == 1 ) {
            acc = Integer.max(arr[0], arr[1]);
            if(arr[0] > arr[1]){
                acc = arr[0];
                System.out.println("########### i " + 0 + " ACC  :  " + acc);
            }else {
                acc = arr[1];
                System.out.println("########### i " + 1 + " ACC  :  " + acc);
            }

        }else if(i == 2) {
            acc = Integer.max(arr[1], arr[2] + arr[0]);
            if(arr[1] > arr[2] + arr[0]){
                acc = arr[1];
                System.out.println("########### i : 1 ACC  :  " + acc);
            }else {
                acc = arr[2] + arr[0];
                System.out.println("########### i : 0, 1, : ACC  :  " + acc);
            }
        }  else {
           int ear = maxNASum(arr, i - 1);
           int ear2 =  maxNASum(arr, i - 2);
           int ear3 = maxNASum(arr, i -3);
           int j = 0;
           if(ear > ear2  + arr[i]){
               if(ear > ear3 + arr[i]) {
                   j = 1;
                   acc = ear;
               }else {
                   j = 3;
                   acc = ear3 + arr[i];
               }
           }else {
               if(ear2 > ear3){
                   j = 2;
                   acc = ear2 + arr[i];
               }else {
                   j = 3;
                   acc = ear3 + arr[i];
               }
           }
           System.out.println("########### i : " + (i - j)  + " ACC  :  " + acc);
           if(j > 1){
               System.out.println("########### i : " + i   + " ACC  :  " + acc);
           }

        }
       return acc ;
    }

}
