package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static double radius = 3.5;
    static double height = 10.0;
    static int[] array = {10, 20, 30, 40, 50};

    public static void main(String[] args) {
        int count = 0;

        Scanner number = new Scanner(System.in);
        System.out.print(++count + ". Введіть ціле число : ");
        int num = number.nextInt();

        System.out.println("\tКвадрат числа " + num + " дорівнює " + multi(num) + ".\n\n"
                + ++count + ". Об'єм циліндра з радіусом 3.5 і висотою 10.0 дорівнює " + volumeCyl(radius, height)
                + ".\n\n" + ++count + ". Масив чисел: " + Arrays.toString(array) + "\n\t" +
                "Сума всіх елементів масиву дорівнює " + arSum(array) + ".\n");

        Scanner scan = new Scanner(System.in);
        System.out.print(++count + ". Введить рядок: ");
        String hello = scan.nextLine();

        System.out.println("\tРядок в зворотньому порядку: " + reverse(hello) + "\n");

        Scanner numIn = new Scanner(System.in);
        System.out.print(++count + ". Введить a: ");
        int numA = scan.nextInt();
        System.out.print("\tВведить b: ");
        int numB = scan.nextInt();

        System.out.println("\tРезультат " + numA + "^" + numB + " дорівнює " + numAB(numA, numB) + ".\n");

        System.out.print(++count + ". Введить ціле число n: ");
        int numberB = scan.nextInt();
        System.out.print("\tВведить текстовий рядок: ");
        String line = scan.nextLine();
        line = scan.nextLine();

        lineFinal(numberB, line);
    }

    private static int numAB(int numA, int numB) {
        return (int) Math.pow(numA, numB);
    }

    private static int multi(int num) {
        return num * num;
    }

    private static double volumeCyl(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;

    }

    private static int arSum(int[] array) {
        int rowSum = 0;
        for (int i = 0; i < array.length; i++) {
            rowSum += array[i];
        }
        return rowSum;
    }

    private static void lineFinal(int numberB, String line) {

        for (int i = 0; i < numberB; i++) {
            System.out.println(line);
        }
    }

    private static String reverse(String line) {
        StringBuilder stringBuilder = new StringBuilder(line.length());

        for (int i = line.length() - 1; i >= 0; i--) {
            stringBuilder.append(line.charAt(i));
        }

        return stringBuilder.toString();
    }


}
