package com.twopointers;

public class PairWithGivenDifference {

    /*--------------------------------------------------------------------------*/
    /* 1. Brute force two for loop : Time Complexity = O(N2)                    */
    /* 2. Binary search as array is already sorted Time Complexity = O(N(LogN)) */
    /* 3. Two pointer : Time Complexity = O(N)                                  */
    /*--------------------------------------------------------------------------*/

    public static int [] findAPairWithGivenDifference(int [] arr, int targetDiff){

        int start = 0, end = 1;

        while(start < end){

            if(arr[end] - arr[start] == targetDiff){
                return new int [] {start, end};
            }else if(arr[end] - arr[start] < targetDiff){
                end++;
            }else{
                start++;
            }
        }

        return new int [] {-1,-1};
    }

    public static void main(String[] args) {

        int [] arr = new int [] {1,2,4,6,18,25};  // Assuming array is already sorted
        int targetDiff = 12;

        int []  resultantArr = findAPairWithGivenDifference(arr,targetDiff);

        for(int a : resultantArr){
            System.out.print(a  + " ,");
        }

        System.out.println();
        System.out.println("A : " + arr[resultantArr[0]] + "  &  " + "B : " + arr[resultantArr[1]]);
    }
}
