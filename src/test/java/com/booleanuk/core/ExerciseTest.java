package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExerciseTest {
    Exercise exercise = new Exercise();

    @Test
    void testNaturalNumbers() {
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, exercise.naturalNumbers(5));
        Assertions.assertArrayEquals(new int[]{1}, exercise.naturalNumbers(1));
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, exercise.naturalNumbers(10));
    }

    @Test
    void testNaturalNumbersReversed() {
        Assertions.assertArrayEquals(new int[]{5, 4, 3, 2, 1}, exercise.naturalNumbersReversed(5));
        Assertions.assertArrayEquals(new int[]{1}, exercise.naturalNumbersReversed(1));
        Assertions.assertArrayEquals(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, exercise.naturalNumbersReversed(10));
    }

    @Test
    void testTimesTable() {
        Assertions.assertArrayEquals(new int[]{3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36}, exercise.timesTable(3));
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, exercise.timesTable(1));
        Assertions.assertArrayEquals(new int[]{11, 22, 33, 44, 55, 66, 77, 88, 99, 110, 121, 132}, exercise.timesTable(11));
    }

    @Test
    void testTimesTableReversed() {
        Assertions.assertArrayEquals(new int[]{60, 55, 50, 45, 40, 35, 30, 25, 20, 15, 10, 5}, exercise.timesTableReversed(5));
        Assertions.assertArrayEquals(new int[]{12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, exercise.timesTableReversed(1));
        Assertions.assertArrayEquals(new int[]{144, 132, 120, 108, 96, 84, 72, 60, 48, 36, 24, 12}, exercise.timesTableReversed(12));
    }

    @Test
    void testAlphabet() {
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Assertions.assertArrayEquals(letters , exercise.alphabet());
    }

    @Test
    void testAlphabetReversed() {
        char[] letters = {'Z', 'Y', 'X', 'W', 'V', 'U', 'T', 'S', 'R', 'Q', 'P', 'O', 'N', 'M', 'L', 'K', 'J', 'I', 'H', 'G', 'F', 'E', 'D', 'C', 'B', 'A'};
        Assertions.assertArrayEquals(letters , exercise.alphabetReversed());
    }

    @Test
    void testEvenNumbers() {
        Assertions.assertArrayEquals(new int[]{2, 4, 6, 8, 10, 12, 14}, exercise.evenNumbers(15));
        Assertions.assertArrayEquals(new int[]{2}, exercise.evenNumbers(3));
        Assertions.assertArrayEquals(new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20}, exercise.evenNumbers(20));
    }

    @Test
    void testOddNumbers() {
        Assertions.assertArrayEquals(new int[]{1, 3, 5, 7, 9}, exercise.oddNumbers(10));
        Assertions.assertArrayEquals(new int[]{1}, exercise.oddNumbers(2));
        Assertions.assertArrayEquals(new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19}, exercise.oddNumbers(19));
    }

    @Test
    void testSumOfNaturalNumbers() {
        Assertions.assertEquals(13, exercise.sumOfNaturalNumbers(5));
        Assertions.assertEquals(1, exercise.sumOfNaturalNumbers(1));
        Assertions.assertEquals(55, exercise.sumOfNaturalNumbers(10));
    }

    @Test
    void testSumOfEvenNumbers() {
        Assertions.assertEquals(30, exercise.sumOfEvenNumbers(10));
        Assertions.assertEquals(2, exercise.sumOfEvenNumbers(2));
        Assertions.assertEquals(650, exercise.sumOfEvenNumbers(50));
    }

    @Test
    void testSumOfOddNumbers() {
        Assertions.assertEquals(25, exercise.sumOfOddNumbers(10));
        Assertions.assertEquals(1, exercise.sumOfOddNumbers(2));
        Assertions.assertEquals(625, exercise.sumOfOddNumbers(50));
    }

    @Test
    void testIntervalOfASCIIChars() {
        Assertions.assertArrayEquals(new char[]{'A', 'B', 'C', 'D', 'E'}, exercise.intervalOfASCIIChars(65, 69));
        Assertions.assertArrayEquals(new char[]{' ', '!'}, exercise.intervalOfASCIIChars(32, 33));
        Assertions.assertArrayEquals(new char[]{'m', 'n', 'o', 'p', 'q', 'r', 's'}, exercise.intervalOfASCIIChars(109, 115));
    }

    @Test
    void testFactorial() {
        Assertions.assertEquals(120, exercise.factorial(5));
        Assertions.assertEquals(1, exercise.factorial(0));
        Assertions.assertEquals(1, exercise.factorial(1));
        Assertions.assertEquals(3628800, exercise.factorial(10));

    }

    @Test
    void testFibonacci() {
        Assertions.assertArrayEquals(new int[]{1, 1, 2, 3, 5}, exercise.fibonacci(5));
        Assertions.assertArrayEquals(new int[]{1, 1}, exercise.fibonacci(2));
        Assertions.assertArrayEquals(new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55}, exercise.fibonacci(10));
    }

    @Test
    void testReverseDigits() {
        Assertions.assertEquals(3791, exercise.reverseDigits(1973));
        Assertions.assertEquals(1, exercise.reverseDigits(1));
        Assertions.assertEquals(21, exercise.reverseDigits(12));
        Assertions.assertEquals(691, exercise.reverseDigits(1960));
    }

    @Test
    void testSumOfDigits() {
        Assertions.assertEquals(20, exercise.sumOfDigits(1973));
        Assertions.assertEquals(1, exercise.sumOfDigits(10));
        Assertions.assertEquals(28, exercise.sumOfDigits(1999));
    }

    @Test
    void testPrime() {
        Assertions.assertTrue(exercise.prime(2));
        Assertions.assertTrue(exercise.prime(101));
        Assertions.assertFalse(exercise.prime(40));
        Assertions.assertFalse(exercise.prime(1));
    }

    @Test
    void testHighestCommonFactor() {
        Assertions.assertEquals(6, exercise.highestCommonFactor(12, 18));
        Assertions.assertEquals(1, exercise.highestCommonFactor(11, 15));
        Assertions.assertEquals(3, exercise.highestCommonFactor(81, 84));
    }

    @Test
    void testLowestCommonMultiple() {
        Assertions.assertEquals(30, exercise.lowestCommonMultiple(10, 15));
        Assertions.assertEquals(5, exercise.lowestCommonMultiple(1, 5));
        Assertions.assertEquals(91, exercise.lowestCommonMultiple(13, 7));
    }

    @Test
    void testMultiplesOfNine() {
        Assertions.assertArrayEquals(new int[]{9, 18, 27, 36}, exercise.multiplesOfNine(1, 40));
        Assertions.assertArrayEquals(new int[]{18}, exercise.multiplesOfNine(10, 20));
        Assertions.assertArrayEquals(new int[]{99, 108, 117, 126, 135, 144}, exercise.multiplesOfNine(95, 145));
    }
}
