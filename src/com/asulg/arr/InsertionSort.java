package com.asulg.arr;

public class InsertionSort {

    private Integer data = null;
    public InsertionSort(int data){
        this.data = data;
    }




    public static void main(String[] arr){
        System.out.println("insertion Sort");

        int[] target = {3,6,1,4,7};
        for( int i : target){
            System.out.println("" + i);
        }

        // count of sets that addup to sum

        System.out.println(" " + setCountAddup(target,10, target.length - 1));

    }


    public static int setCountAddup(int[] arr, int sum, int i){
        if(sum == 0){
            System.out.print( "  arr " );
            for( int j : arr){
                System.out.print( " , " + j);
            }
            return 1;
        }else if(i < 0){
            return 0;
        }else if(sum < 0){
            return 0;
        }else if( arr[i] > sum ){
            return setCountAddup(arr, sum, i - 1);
        }else {
            return setCountAddup(arr, sum - arr[i] , i - 1) + setCountAddup(arr, sum, i - 1);
        }
    }



}
