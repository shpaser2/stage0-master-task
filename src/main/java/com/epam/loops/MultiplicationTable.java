package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for (int x = 1; x <= 10; x++)
            System.out.println(x + " x " + numberTableToPrint + " = " + (x * numberTableToPrint));
    }

}
