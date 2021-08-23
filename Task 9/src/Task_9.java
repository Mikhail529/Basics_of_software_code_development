import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 9. Даны три точки A(x1,y1), B(x2,y2), C(x3,y3).
        // Определить, будут ли они расположены на одной прямой

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates point A");
        System.out.println("Enter x1: ");
        int x1 = scanner.nextInt();
        System.out.println("Enter y1: ");
        int y1 = scanner.nextInt();

        System.out.println("Enter coordinates point B");
        System.out.println("Enter x2: ");
        int x2 = scanner.nextInt();
        System.out.println("Enter y2: ");
        int y2 = scanner.nextInt();

        System.out.println("Enter coordinates point C");
        System.out.println("Enter x3: ");
        int x3 = scanner.nextInt();
        System.out.println("Enter y3: ");
        int y3 = scanner.nextInt();

        if (x1 == x2 && x1 == x3 && y1 == y2 && y1 == y3)
            System.out.println("Все три точки расположены на одной прямой");
        else System.out.println("Точки не лежат на одной прямой");
    }
}