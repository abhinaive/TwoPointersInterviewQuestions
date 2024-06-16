package com.twopointers;

public class FourSum {

    /*-----------------------------------------------------------------------------*/
    /* 1. Brute force four for loop : Time Complexity = O(N3)                      */
    /*                   Using two for loop and a binary search                    */
    /* 2. Binary search as array is already sorted Time Complexity = O(N2(LogN))   */
    /* 3. Two pointer : Time Complexity =  N(N)  = O(N2)                           */
    /*-----------------------------------------------------------------------------*/

    public static int [] fourSumUsingTwoPointer(int [] arr, int target){

        int start = 0, end = 0, twoSumTarget = 0;

        for(int k = 0; k < arr.length - 3; k++){            // O(N)

            for(int i = k+1; i < arr.length - 2; i++) {     // O(N)

                start = i + 1;
                end =  arr.length - 1;
                twoSumTarget = target - arr[k] - arr[i];

                while (start < end){                        // O(N)

                    if(arr[start] + arr[end] == twoSumTarget){
                        return new int [] {k,i,start, end};
                    }
                    else if(arr[start] + arr[end] > twoSumTarget){
                        end--;
                    }else{
                        start++;
                    }
                }
            }

        }

        return new int [] {-1,-1,-1,-1};
    }

    public static void main(String[] args) {

        int [] arr = new int [] {2,4,6,8,10,45,50,90,100};  // Assuming array is already sorted
        int target = 195;

        int []  resultantArr = fourSumUsingTwoPointer(arr,target);

        for(int a : resultantArr){
            System.out.print(a  + " ,");
        }

        System.out.println();
        System.out.println("A : " + arr[resultantArr[0]] + "  &  " + "B : "
                + arr[resultantArr[1]] + "  &  " + "C : " + arr[resultantArr[2]] + "  &  " + "D : " + arr[resultantArr[3]]);

    }

}
