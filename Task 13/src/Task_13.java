import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 13. Вычислить значения функции на отрезке [a, b] с шагом h

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter start line A");
        int a = scanner.nextInt();
        System.out.println("Enter finish line B");
        int b = scanner.nextInt();
        System.out.println("Enter step h");
        double h = scanner.nextDouble();
        System.out.println("Enter the value of x");
        int x = scanner.nextInt();

        int y;

        for (double i = a; i <= b; i = i + h) {
            if (x > 2) {
                y = x;
            } else
                y = -x;
            System.out.println("x = "+ x + "\n" + "y = " + y);
        }
    }
}