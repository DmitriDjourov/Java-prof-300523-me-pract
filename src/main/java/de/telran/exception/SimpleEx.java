package de.telran.exception;

import lombok.SneakyThrows;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleEx {
    public static void main(String[] args) {


            int[] arr = {1, 5, 8, 3};
            System.out.println(max(arr));

            System.out.println(inputInt());

            System.out.println(inputInt2());


    }

    static int max(int[] arr) throws NullPointerException {
        if(arr==null || arr.length==0) {
            throw new NullPointerException();
//            return Integer.MIN_VALUE;
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    static int inputInt() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        int num = Integer.MIN_VALUE;

        do {
            flag = false;
            System.out.println("Введите целое число: ");
            try {
                scanner.nextLine();
                num = scanner.nextInt();

            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Вы ввели некоректное значение!");
                flag = true;
            } catch (Exception e) {
                flag = false;
                throw e;
            }
        }while (flag);

        return num;
    }

    static int inputInt2() throws InputMismatchException  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int num = scanner.nextInt();
        return num;
    }

}
