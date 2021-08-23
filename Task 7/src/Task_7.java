import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 7. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
        // если да, то будет ли он прямым.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the angle first: ");
        int a = scanner.nextInt();
        System.out.println("Enter the angle second: ");
        int b = scanner.nextInt();

        if (a+b < 180) {
            System.out.println("Треугольник существует");
            if ( (a==90) || (b==90) || (a + b == 90) )
                System.out.println("Треугольник прямоугольный");
        } else System.out.println("Треугольник не существует");
    }
}