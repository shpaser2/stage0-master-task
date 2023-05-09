package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int revertedNumber = 0;
        int modulus;

        while(number > 0) {
            revertedNumber *= 10;

            modulus = number % 10;
            number /= 10;

            revertedNumber += modulus;
        }
        System.out.println(revertedNumber);
    }

}
