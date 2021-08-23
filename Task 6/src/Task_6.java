import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 6. Для данной области составить линейную программу, которая печатает true,
        // если точка с координатами (x,y) предналижит закрашенной области,
        // и false в противном случае

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter point of X: ");
        int x = scanner.nextInt();
        System.out.println("Enter point of Y: ");
        int y = scanner.nextInt();

        if ( (x >= -4 && x <= 4 && y <= 0 && y >= -3) || (x >= -2 && x <= 2 && y >= 0 && y <= 4)) {
            System.out.println("true");
        } else System.out.println("false");
    }
}