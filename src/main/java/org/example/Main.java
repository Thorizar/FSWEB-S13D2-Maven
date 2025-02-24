package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    public static boolean isPalindrome(int number) {
        int original = Math.abs(number);
        int reverse = 0;
        int temp = original;

        while (temp > 0) {
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp /= 10;
        }

        return original == reverse;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 0) return false;

        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }

        return sum == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) return "Invalid Value";

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        StringBuilder result = new StringBuilder();

        String numStr = String.valueOf(number);
        for (char digit : numStr.toCharArray()) {
            result.append(words[digit - '0']).append(" ");
        }

        return result.toString().trim();
    }
}
