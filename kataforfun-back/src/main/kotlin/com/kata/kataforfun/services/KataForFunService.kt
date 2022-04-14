package com.kata.kataforfun.services

import org.springframework.stereotype.Component

@Component
class KataForFunService {

    /**
     * Function that converts an int input number to a String based on these rules:
     * If the number is divisible by 3 or contains 3, replace 3 by "Kata";
     * if the number is divisible by 5 or contains 5, replace 5 by "For";
     * if the number contains 7, replace 7 by "Fun".
     * Divisors have high predecence, the content is analyzed in the order of appearance.
     * If no match, return the input number as a string.
     *
     * @param inputNumber the number to convert.
     * @return the converted
     */
    fun convertNumber(inputNumber: Int): String {
        val sb: StringBuilder = StringBuilder()

        sb.appendIf("Kata", inputNumber) { i -> i % 3 == 0 }
          .appendIf("For", inputNumber) { i -> i % 5 == 0 }

        for (c in inputNumber.toString()) {
            sb.appendIf("Kata", Character.getNumericValue(c)) { i -> i == 3 }
            sb.appendIf("For", Character.getNumericValue(c)) { i -> i == 5 }
            sb.appendIf("Fun", Character.getNumericValue(c)) { i -> i == 7 }
        }

        if(!sb.isNullOrEmpty()) {
            return sb.toString()
        }

        return inputNumber.toString()
    }

    fun StringBuilder.appendIf(appendValue: String, input: Int, predicate: (Int) -> Boolean): StringBuilder {
        if (predicate(input)) {
            return this.append(appendValue)
        }
        return this;
    }

}