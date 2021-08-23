import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 16. Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда,
        // модуль которых больше или равен заданному e. Общий член ряда имеет вид: a =  1/2^n + 1/3^n

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of E: ");
        double e =  scanner.nextDouble();

        int n = 0;
        double sum = 0;

        System.out.println("Print a series of common member series: ");
        for (int i = 0; i<=10; i++){
            ++n;
            System.out.print("\n");
            double a =  (1/Math.pow(2,n))+ (1/Math.pow(3,n));
            System.out.printf("%.4f", a);
            if (e <= Math.abs(a))
                sum = sum+a;
            System.out.printf(" sum is %f", sum);
        }
    }
}