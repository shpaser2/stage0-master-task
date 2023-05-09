package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int y = 1; y <= cathetusLength; y++) {
            for (int x = 1; x <= cathetusLength; x++) {
                if ((x > cathetusLength - y) && x != cathetusLength) {
                    System.out.print("*");
                } else if (x == cathetusLength) {
                    System.out.println("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
