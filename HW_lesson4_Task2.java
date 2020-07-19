package AlexeyBasalay.HomeWork.lesson2.HomeWork2;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую и отображающую все числа
 * Фибоначчи меньше введённого пользователем целого числа.
 *     Решить  с помощью цикла.
 */
public class HW_lesson4_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int inputValue = scanner.nextInt();
        printFibo(inputValue);

    }
    public static void printFibo(int inputValue){
        int first = 0;
        int second = 1;
        while (second < inputValue){
            System.out.println(second);
            int next = first + second;
            first = second;
            second = next;
        }

        }


    }


