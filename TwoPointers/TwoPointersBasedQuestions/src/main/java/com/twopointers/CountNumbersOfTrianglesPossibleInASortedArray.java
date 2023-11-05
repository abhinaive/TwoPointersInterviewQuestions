package com.twopointers;

public class CountNumbersOfTrianglesPossibleInASortedArray {

    /*--------------------------------------------------------*/
    /* if a,b,c are sides of a triangle & (a < b < c) then we */
    /* only need to check if (a + b > c) to form a triangle   */
    /*--------------------------------------------------------*/

    public static int countNumberOfPossibleTrianglesIfGivenSidesAreSorted(int [] sides){

        int count = 0;

        for(int thirdSide_idx = sides.length -1; thirdSide_idx >= 2; thirdSide_idx--){ // Start from largest side and at a time minimum 3 elements should be within our window
            int firstSide_idx = 0;
            int secondSide_idx = thirdSide_idx - 1;

            while(firstSide_idx < secondSide_idx) {    /* As index_of(a) and index_of(b) are approaching each other index_of(a) can never cross index_of(b) */

                if (sides[firstSide_idx] + sides[secondSide_idx] > sides[thirdSide_idx]) {
                   count += secondSide_idx - firstSide_idx;
                    secondSide_idx--;    // Decrease the second side to see if still sum of first and second side > third side
                }else{
                    firstSide_idx++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] sides = {1,3,4,6,12,13,16,20};
        System.out.println("Number of Triangles Possible are : " + countNumberOfPossibleTrianglesIfGivenSidesAreSorted(sides));
    }

}

