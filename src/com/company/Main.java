package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;
        while (number != 0) {
        int lastDigit = number % 10;
        reverse = (reverse * 10 ) + lastDigit;
        number /= 10;
        }
        if (reverse == palindrome){
            return true;
        }else {
            return false;
        }

    }


}
