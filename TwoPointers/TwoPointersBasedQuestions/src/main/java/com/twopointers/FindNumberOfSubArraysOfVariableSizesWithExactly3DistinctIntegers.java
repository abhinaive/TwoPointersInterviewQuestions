package com.twopointers;

import java.util.HashMap;
import java.util.Map;

public class FindNumberOfSubArraysOfVariableSizesWithExactly3DistinctIntegers {

    public static int findNumberOfSubArraysWithAtmost_3_DistictIntegers(int [] arr, int subArraySize){

        int leftPtr = 0,rightPtr = 0,count = 0;

        Map<Integer,Integer> map = new HashMap<>();

        while(rightPtr < arr.length){

            map.put(arr[rightPtr],map.getOrDefault(arr[rightPtr],0)+1);

            while(map.size() > subArraySize){

                map.put(arr[leftPtr],map.get(arr[leftPtr])-1);

                if(map.get(arr[leftPtr]) == 0)
                    map.remove(arr[leftPtr]);

                leftPtr++;
            }

            count = count + (rightPtr - leftPtr + 1);
            rightPtr++;


        }

        return count;
    }

    public static int findNumberOfSubArraysWithAtmost_2_DistictIntegers(int [] arr, int subArraySize){

        int leftPtr = 0,rightPtr = 0,count = 0;

        Map<Integer,Integer> map = new HashMap<>();

        while(rightPtr < arr.length){

            map.put(arr[rightPtr],map.getOrDefault(arr[rightPtr],0)+1);

            while(map.size() > subArraySize){

                map.put(arr[leftPtr],map.get(arr[leftPtr])-1);

                if(map.get(arr[leftPtr]) == 0)
                    map.remove(arr[leftPtr]);

                leftPtr++;
            }

            count = count + (rightPtr - leftPtr + 1);
            rightPtr++;


        }

        return count;

    }

    public static void main(String[] args) {

        int [] arr = {1,2,1,3,4};

        int NumberOfSubArraysWithAtmost_2_DistictIntegers = findNumberOfSubArraysWithAtmost_2_DistictIntegers(arr,2);
        System.out.println("Number Of SubArrays With Atmost 2 Distinct Integers : " + NumberOfSubArraysWithAtmost_2_DistictIntegers);


        int NumberOfSubArraysWithAtmost_3_DistictIntegers = findNumberOfSubArraysWithAtmost_3_DistictIntegers(arr,3);
        System.out.println("Number Of SubArrays With Atmost 3 Distinct Integers : " + NumberOfSubArraysWithAtmost_3_DistictIntegers);


        int NumberOfSubArraysOfVariableSizesWithExactly3DistinctIntegers =  NumberOfSubArraysWithAtmost_3_DistictIntegers - NumberOfSubArraysWithAtmost_2_DistictIntegers;

        System.out.println("Number Of SubArrays Of Variable Sizes With Exactly 3 Distinct Integers : " + NumberOfSubArraysOfVariableSizesWithExactly3DistinctIntegers);

    }
}
