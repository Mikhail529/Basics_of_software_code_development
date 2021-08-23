import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 8. Найти max{min(a,b), min(c,d)}

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value A: ");
        int a = scanner.nextInt();
        System.out.println("Enter value B: ");
        int b = scanner.nextInt();
        System.out.println("Enter value C: ");
        int c = scanner.nextInt();
        System.out.println("Enter value D: ");
        int d = scanner.nextInt();

        int m, n;

        if (a >= b)
            m = b;
        else m = a;

        if (c >= d)
            n = d;
        else n = c;

        if (m >= n)
            System.out.println("Max {min(a,b), min(c,d)}: " + m);
        else System.out.println("Max {min(a,b), min(c,d)}: " + n);
    }
}