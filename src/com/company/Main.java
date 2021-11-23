package com.company;
//ОТ 1 ДО N (Дано натуральное число. выведите все числа от 1 до N)
public class Main {
    public static String recursion(int n) {
        // Базовый случай
        if (n == 1) {
            return "1";
        }
        // Шаг рекурсии
        return recursion(n - 1) + "  " + n;
    }
    public static void main(String[] args) {
        System.out.println(recursion(8)); // вызов рекурсивной функции
    }
}

