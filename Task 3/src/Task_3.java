import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 3. Вычислить значение выражения по формуле (все переменные принемают действительные значения):
        // ( (sin(x) + cos(y) ) / (cos(x) - sin(y)) ) * tg xy

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of X: ");
        double x = scanner.nextDouble();
        System.out.println("Enter value of Y: ");
        double y = scanner.nextDouble();
        double z = ( ( (Math.sin(x) + Math.cos(y) ) / (Math.cos(x) + Math.sin(y)) ) * Math.tan(x*y) );

        System.out.printf("The result is: %.2f \n", z);
    }
}