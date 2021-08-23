import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 12. Напишите программу, где пользователь вводит любое положительное число. А программа суммирует
        // все числа от 1 до введенного пользователем числа.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any positive number: ");
        int s = scanner.nextInt();

        if (s/2 == 0 || s!=1) {
            int tmp = 0;

            for (int i = 1; i <= s; i++) {
                tmp+=i;
            }
            System.out.println("Summa numbers: " + tmp);
        } else System.out.println("Number is negative!");
    }
}