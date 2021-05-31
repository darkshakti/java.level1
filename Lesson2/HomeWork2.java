package ru.margo.lesson2;


public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(within10and20(3, 4));
        isPositiveOrNegative(5);
        System.out.println(trueOrFalse(3));
        printWordNTimes("Meow", 8);
    }

    /*
  1. Написать метод, принимающий на вход два целых числа и проверяющий,
  что их сумма лежит в пределах от 10 до 20 (включительно),
  если да – вернуть true, в противном случае – false.
*/
    public static boolean within10and20(int a, int b) {
        boolean x = true;
        if (a + b >= 10 && a + b <= 20) {
        } else {
            x = false;
        }
        return x;
    }

    /*
    2. Написать метод, которому в качестве параметра передается целое число, метод должен
    напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль
    считаем положительным числом.
    */
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }

    /*
    3. Написать метод, которому в качестве параметра передается целое число. Метод должен
     вернуть true, если число отрицательное, и вернуть false если положительное.
    */
    public static boolean trueOrFalse(int a) {
        if (a > 0) {
            return false;
        }
        return true;
    }

    /*
    4. Написать метод, которому в качестве аргументов передается строка и число,
     метод должен отпечатать в консоль указанную строку, указанное количество раз;
    */
    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }
    /*
     5. * Написать метод, который определяет, является ли год високосным, и возвращает
     boolean (високосный - true, не високосный - false). Каждый 4-й год является
     високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    */
   // public static boolean isLeapYear (int god) {
   // }
}



