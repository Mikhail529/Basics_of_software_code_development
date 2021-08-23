import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 11. Вычислить значение функции

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of X: ");
        double x = scanner.nextDouble();

        double f1, f2;

        if (x <= 3) {
            f1 = Math.pow(x, 2) - 3 * x + 9;
            System.out.printf("F(x) = %.2f", f1);
        }
        else if (x > 3) {
            f2 = 1 / (Math.pow(x, 3) + 6);
            System.out.printf("F(x): %.2f", f2);
        }
    }
}