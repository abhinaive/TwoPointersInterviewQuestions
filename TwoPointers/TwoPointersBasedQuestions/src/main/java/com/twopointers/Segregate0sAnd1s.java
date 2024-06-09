package com.twopointers;

/*-----------------------------------------------------------*/
/* 1. Brute Force : Sort the Array : Bubble, Insertion O(n2) */
/* 2. Count 0s,1s and rewrite the array.                     */
/*-----------------------------------------------------------*/

public class Segregate0sAnd1s {

    public static void segregate0sAnd1sInTheGivenArray(int arr []){

        int start = 0, end = arr.length - 1;

        while(start <= end){

            if(arr[start] == 0){
                start++;
            }else{
                if(arr[end] == 1){
                    end--;
                }else{
                    arr[start] = 0;
                    arr[end] = 1;
                    start++;
                    end--;
                }
            }
        }


    }

    public static void main(String[] args) {

        int [] arr = new int [] {0,0,1,0,0,1,0,1,1};

        segregate0sAnd1sInTheGivenArray(arr);

        for(int a : arr){
            System.out.print(" ," + a);
        }

    }
}
