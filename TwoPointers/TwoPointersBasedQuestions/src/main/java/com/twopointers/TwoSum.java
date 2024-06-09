package com.twopointers;

public class TwoSum {

    /*--------------------------------------------------------------------------*/
    /* 1. Brute force two for loop : Time Complexity = O(N2)                    */
    /* 2. Binary search as array is already sorted Time Complexity = O(N(LogN)) */
    /* 3. Two pointer : Time Complexity = O(N)                                  */
    /*--------------------------------------------------------------------------*/

    public static int [] twoSumUsingTwoPointer(int [] arr, int target){

        int start = 0, end = arr.length - 1;

        while (start < end){

            if(arr[start] + arr[end] == target){
                return new int [] {start, end};
            }
            else if(arr[start] + arr[end] > target){
                end--;
            }else{
                start++;
            }
        }

        return new int [] {-1,-1};

    }

    public static void main(String[] args) {

        int [] arr = new int [] {1,2,4,6,18,25};  // Assuming array is already sorted
        int target = 10;

        int []  resultantArr = twoSumUsingTwoPointer(arr,target);

        for(int a : resultantArr){
            System.out.print(a  + " ,");
        }

        System.out.println();
        System.out.println("A : " + arr[resultantArr[0]] + "  &  " + "B : " + arr[resultantArr[1]]);

    }
}
