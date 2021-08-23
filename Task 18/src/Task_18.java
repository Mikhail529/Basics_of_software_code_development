import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 18. Для каждого натурального числа в промежутке от m до n вывести все делители,
        // кроме единицы и самого числа. m и n вводятся с клавиатуры

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число m:");
        int m = scanner.nextInt();
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();

        for (int i=m; i<=n; i++) {
            int tmp = i;
            System.out.print(tmp + "\t\t-  ");
            for (int j = 1; j <= tmp; j++) {
                if (tmp % j == 0 && (!(j == 1)) && (!(j == tmp)))
                    System.out.print(j + ", ");
            }
            System.out.println("");
        }
    }
}