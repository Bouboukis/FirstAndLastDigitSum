package com.georgioskachrimanis.javacourse;
// Coding Exercise 16 from the Java course https://www.udemy.com/course/java-the-complete-java-developer-course/
// We have to make a method, that returns the sum of 1st and last digit of any positive number.

public class Main {

    public static void main(String[] args) {

        for (int i = 10; i < 24; i++) {
            System.out.println( "If you add the number's " + i + " first and last bit, the sum is: "
                    + FirstLastDigitSum.sumFirstAndLastDigit(i));
        }
    }
}
