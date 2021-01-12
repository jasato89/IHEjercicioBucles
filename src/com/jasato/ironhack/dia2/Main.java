package com.jasato.ironhack.dia2;

public class Main {

    public static void main(String[] args) {

        int[] arrayInt = {5, 3, 6, 3, 2, 8, 9};
        int[] arrayMultiply = multiply(arrayInt);
        int[] arrayInvert = invert(arrayInt);

        for (int i : arrayMultiply) {
            System.out.println(i);
        }

        for (int i : arrayInvert) {
            System.out.println(i);
        }

    }

    public static int[] multiply(int[] arrayInt) {
        int[] newArray = new int[arrayInt.length];
        for (int i = 0; i < arrayInt.length; i++) {
            if (i + 1 == arrayInt.length) {
                newArray[i] = arrayInt[i] * arrayInt[0];

            } else {
                newArray[i] = arrayInt[i] * arrayInt[i + 1];
            }
        }
        return newArray;
    }

    public static int[] invert(int[] arrayInt) {
        int[] newArray = new int[arrayInt.length];
        int x = 0;

        for (int i = arrayInt.length - 1; i >= 0; i--) {
            newArray[x] = arrayInt[i];
            x++;
        }
        return newArray;
    }
}
