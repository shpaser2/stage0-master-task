package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        int actualLength = cathetusLength * 2 - 1;
        int t = 0;

        for (int y = 1; y <= cathetusLength; y++) {
            t = cathetusLength;
            for (int x = 1; x <= actualLength; x++) {
                if (x > cathetusLength - y) {
                    if (x < (cathetusLength + y - 1)) {
                        System.out.print(t);
                    } else if (x == (cathetusLength + y - 1)) {
                        System.out.println(t);
                        break;
                    }
                } else {
                    System.out.print(" ");
                }

                if (x < cathetusLength) {
                    t--;
                } else {
                    t++;
                }
            }
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
