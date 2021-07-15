package com.georgioskachrimanis.javacourse;

public class FirstLastDigitSum {

    static public int sumFirstAndLastDigit (int number) {
        int lastDigit;

        if (number < 0) {
            return -1;
        }

        // In case we have one digit numbers.
        if (number /10 == 0){
            return 2 * number;
        }

        // Separating the last digit.
        lastDigit = number % 10;
        number /= 10;

        //Main loop to cut out the digits between first and last digit.
        // As long as the number has 2 digits the loop will repeat.
        while (number >= 10 ) {
            number /= 10;
        }

        return (number + lastDigit);
    }

}
