package com.booleanuk.core;

import java.util.ArrayList;

public class Exercise {

    //    1. Write a function to return an array containing the natural numbers from 1 to n, inclusive.
    public int[] naturalNumbers(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    //    2. Write a function to return an array containing the natural numbers from 1 to n inclusive in reverse.
    public int[] naturalNumbersReversed(int n) {
        int[] arr = new int[n];
        for (int i = n; i > 0; i--) {
            arr[n - i] = i;
        }
        return arr;
    }

    //    3. Write a function to return an array containing the answers to a given times-table (given n return the n times table).
    public int[] timesTable(int n) {
        int[] arr = new int[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1) * n;
        }
        return arr;
    }

    //    4. Write a function to return an array containing the reverse of a given times-table (given n return the reverse of the n times-table).
    public int[] timesTableReversed(int n) {
        int[] arr = new int[12];
        for (int i = 12; i > 0; i--) {
            arr[12 - i] = i * n;
        }
        return arr;
    }

    //    5. Write a function to return an array containing the letters in order from a to z. Return an array of chars.
    //      Look up how to convert
    public char[] alphabet() {
        int charAmount = 'z' - 'a' + 1;
        char[] alpha = new char[charAmount];
        for (int i = 0; i < charAmount; i++) {
            alpha[i] = (char) ('a' + i);
        }
        return alpha;
    }

    //    6. Write a function to return an array containing the capital letters from Z to A
    public char[] alphabetReversed() {
        char[] capitalLetters = new char[26];
        int index = 0;
        for (char c = 'Z'; c >= 'A'; c--) {
            capitalLetters[index] = c;
            index++;
        }
        return capitalLetters;
    }

    //    7. Write a function to return an array containing all even numbers from 1 to n.
    public int[] evenNumbers(int n) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                arrList.add(i);
            }
        }
        int[] arr = arrList.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }

    //    8. Write a function to return an array containing all odd number from 1 to n.
    public int[] oddNumbers(int n) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                arrList.add(i);
            }
        }
        int[] arr = arrList.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }

    //    9. Write a function to return the sum of all natural numbers from 1 to n.
    public int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    //    10. Write a function to return the sum of all even numbers from 1 to n.
    public int sumOfEvenNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    //    11. Write a function to return sum of all odd numbers from 1 to n.
    public int sumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }

    //    12. Write a function to return an array containing the letters between two ASCII values (which are arguments to the function).
    public char[] intervalOfASCIIChars(int lower, int upper) {
//        int length = Math.abs(upper - lower) - 1;
//        char[] letters = new char[length];
//
//        int startIndex = Math.min(lower, upper) + 1;
//        int endIndex = Math.max(lower, upper) - 1;
//
//        for (int i = startIndex, j = 0; i <= endIndex; i++, j++) {
//            letters[j] = (char) i;
//        }
//
//        return letters;
        return new char[]{0};
    }

    //    13. Write a function to return the factorial value of any number.
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    //    14. Write a function to return an array containing the first n Fibonacci values.
    public int[] fibonacci(int n) {
        int[] fibonacci = new int[n];
        if (n >= 1) {
            fibonacci[0] = 1;
        }
        if (n >= 2) {
            fibonacci[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    //    15. Write a function to return a number made up of the reversed digits of the given number (1973 -> 3791).
    public int reverseDigits(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed;
    }

    //    16. Write a function to return the sum of the digits of a given number (1973 -> 20).
    public int sumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum +=  digit;
            number /= 10;
        }

        return sum;
    }

    //    17. Write a function to check whether a given number is prime or not.
    public boolean prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //    18. Write a function that will return the Highest Common Factor of two given numbers.
    public int highestCommonFactor(int firstNumber, int secondNumber) {
        int hcf = 1;
        int min = Math.min(firstNumber, secondNumber);

        for (int i = 1; i <= min; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                hcf = i;
            }
        }

        return hcf;
    }

    //    19. Write a function that will return the Lowest Common Multiple of two given numbers.
    public int lowestCommonMultiple(int firstNumber, int secondNumber) {
        int lcm = (firstNumber * secondNumber) / highestCommonFactor(firstNumber, secondNumber);
        return lcm;
    }

    //    20. Write a function to return an array containing all of the multiples of 9 between two numbers.
    public int[] multiplesOfNine(int firstNumber, int secondNumber) {
        int start = Math.min(firstNumber, secondNumber);
        int end = Math.max(firstNumber, secondNumber);
        ArrayList<Integer> multiples = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (i % 9 == 0) {
                multiples.add(i);
            }
        }
        int[] arr = multiples.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}
