package org.example;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(doOne(5, 7));
        doTwo(5);
        System.out.println(doThree(-1));
        doFour("Vladimir");
    }

    //1. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
    //в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    static boolean doOne(int a, int b) {
        System.out.println("\nЗадание 1.");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    //2. Написать метод, которому в качестве параметра передается целое число, метод должен
    //напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль
    //считаем положительным числом.
    static void doTwo(int a) {
        System.out.println("\nЗадание 2.");
        if (a >= 0) System.out.println("Число " + a + " положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

    //3. Написать метод, которому в качестве параметра передается целое число, метод должен
    //вернуть false, если число положительное;System.out.println("7, " + name + "!");
    static boolean doThree(int a) {
        System.out.println("\nЗадание 3.");
        if (a < 0) return false;
        return false;
    }

    //4. Написать метод, которому в качестве аргументов передается строка и число,
    //метод должен отпечатать в консоль указанную строку, указанное количество раз;
    static void doFour(String name) {
        System.out.println("\nЗадание 4.");
        System.out.println("7, " + name + "!");
        System.out.println("7, " + name + "!");
        System.out.println("7, " + name + "!");
        System.out.println("7, " + name + "!");
    }
}