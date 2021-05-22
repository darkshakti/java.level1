package ru.margo.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a,b,c;
        a=12;
        System.out.println("a="+a);
        b=-13;
        System.out.println("b="+b);
        c=a+b;
        System.out.println("c=a+b="+c);
        if (c>=0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
      int value;
      value=12;
        System.out.println("value="+value);
        if (value<=0) {
            System.out.println("Красный");
        }
        if (value>0 && value<=100) {
            System.out.println("Желтый");
        }
        if (value>100) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a,b;
        a=12;
        System.out.println("a="+a);
        b=-13;
        System.out.println("b="+b);
        if (a>=b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a<b");
        }
    }
}
