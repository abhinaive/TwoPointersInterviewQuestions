package com.twopointers;

public class HappyNumber {

    public static int getNextNumberAfterAddingSquaresOfItsDigits(int n){

        int totalSum = 0;

        while(n > 0){
            int d;
            d = n%10;    // Gives Last Digit
            n = n/10;        // Drops the ones place of number

            totalSum = totalSum + d*d;
        }
        return totalSum;

    }

    public static boolean isItHappyNumber(int n){

        int slowRunner = n;
        int fastRunner = getNextNumberAfterAddingSquaresOfItsDigits(n);

        while(fastRunner != 1 && slowRunner != fastRunner) {
            slowRunner = getNextNumberAfterAddingSquaresOfItsDigits(slowRunner);
            fastRunner = getNextNumberAfterAddingSquaresOfItsDigits(getNextNumberAfterAddingSquaresOfItsDigits(fastRunner));
        }
        return fastRunner == 1;
    }

    public static void main(String[] args) {
        System.out.println(HappyNumber.isItHappyNumber(19));
    }
}
