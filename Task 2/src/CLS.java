import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения)

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter value of A: ");
        double a = scanner.nextDouble();
        System.out.println("Enter value of B: ");
        double b = scanner.nextDouble();
        System.out.println("Enter value of C: ");
        double c = scanner.nextDouble();
        double z = ( ( (b + Math.sqrt(Math.pow(b,2) + 4*a*c) ) / (2*a) ) - Math.pow(a, 3) * c + Math.pow(b, -2) );

        System.out.printf("The result is: %.5f \n", z);
    }
}