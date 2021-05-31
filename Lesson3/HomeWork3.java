package ru.margo.lesson3;

import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {
        System.out.println("Задание 1:");
        System.out.println(Arrays.toString(invertArray(new int[] {1,1,0,0,1,0,1,1,0,0}))+ "\n");
        System.out.println("Задание 2:");
        System.out.println(Arrays.toString(fillArray(100))+ "\n");
        System.out.println("Задание 3:");
        System.out.println(Arrays.toString(changeArray(new int[] {1,5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}))+ "\n");
        System.out.println("Задание 4:");
        fillDiagonals(5);
        System.out.println("Задание 5:");
        System.out.println(Arrays.toString(getLenAndInitialValue(5, 7)));
    }
  /*  1.  Задать целочисленный массив, состоящий из элементов 0 и 1.
     Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия
     заменить 0 на 1, 1 на 0;*/
    public static int[] invertArray(final int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 0) {
                input[i]=1;
            } else
                input[i]=0;
        }
        return input;
    }

    /* 2.Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
    значениями 1 2 3 4 5 6 7 8 … 100;*/
    public static int[] fillArray(final int length) {
        int counter = 1;
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = counter;
            counter++;
        }
        return arr;
    }

    /*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
      умножить на 2;*/
    public static int[] changeArray(final int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 6) {
                input[i] *= 2 ;
            }
        }
        return input;
    }

    /*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
     одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
     (можно только одну из диагоналей, если обе сложно). Определить элементы одной из
    диагоналей можно по следующему принципу: индексы таких элементов равны,
     то есть [0][0], [1][1], [2][2], …, [n][n];*/
    public static void fillDiagonals(final int size){
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            int rowLength = table[i].length;
            for (int j = 0; j < rowLength; j++) {
                if ((i == j) || (j==rowLength-1-i)) {
                    table[i][j]=1;
                }
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

   /* 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
  одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;*/
    public static int[] getLenAndInitialValue(int len, int initialValue) {
        int[] arr1 = new int[len];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=initialValue;
        }
        return arr1;
    }
}
//6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
