import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        //Task 1. Найти значение функции: z = ((a - 3) * b / 2) + c

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of A: ");
        double a = scanner.nextDouble();
        System.out.println("Enter value of B: ");
        double b = scanner.nextDouble();
        System.out.println("Enter value of C: ");
        double c = scanner.nextDouble();
        double z = ((a - 3) * b / 2) + c;

        System.out.println("The Result is: " + z);
    }
}