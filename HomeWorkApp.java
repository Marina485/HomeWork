package ru.homeworkapp;

/**
 * Java 1. Homework #2
 *
 * @autor Marina Terekhova
 * @version 14.02.2022
 */
class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println(range10_20(7,16));
        positNegatPrint(0);
        System.out.println(posNeg(0));
        printStrNum("it turned out", 7);
    }

     static boolean range10_20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void positNegatPrint(int c) {
        System.out.println(c >= 0 ? "Positive" : "Negative");
    }

    static boolean posNeg(int e) {
        return e < 0;
    }

    static void printStrNum(String str, int n) {
        for (; n > 0; n--) {
            System.out.println(str);
        }
    }
}



