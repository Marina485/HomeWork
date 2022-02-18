package ru.homeworkapp;
import java.util.Arrays;

/**
 * Java 1. Homework #3
 *
 * @autor Marina Terekhova
 * @version 18.02.2022
 */

class HomeWorkApp {
    public static void main(String[] args) {
        zeroOne();
        hundred();
        mult();
        square();
        System.out.println(Arrays.toString(initArray(10,16)));
        System.out.println(Arrays.toString(initArray(20,1)));
    }
        static void zeroOne() {
            int[] arr = {1, 0, 1, 1, 0, 0, 1, 0};
            System.out.println(Arrays.toString(arr));
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    arr[i] = 1;
                } else {
                    arr[i] = 0;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        static void hundred() {
            int[] arrh = new int[100];
            for (int i = 0; i < arrh.length; i = i +1) {
                arrh[i] = i + 1;
        }
            System.out.println(Arrays.toString(arrh));
        }

        static void mult() {
            int[] arrm = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arrm.length; i++) {
                if (arrm[i] < 6) {
                    arrm[i] = arrm[i] * 2;
                }
            }
            System.out.println(Arrays.toString(arrm));
        }

        static void square() {
            int[] [] arrs = new int[5][5];
            for (int i = 0; i < 5; i++){
                for (int j = 0; j < 5; j++) {
                    if(i == j || i == 4 - j) arrs[i][j] = 1;
                }
                System.out.println(Arrays.toString(arrs[i]));
            }
            System.out.println();
        }

        static int[] initArray(int len, int initVal) {
            int[] arr = new int[len];
            for (int i = 0; i < arr.length; i++){
                arr[i] = initVal;
            }
            return arr;
        }
}



