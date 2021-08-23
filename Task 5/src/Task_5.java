import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 5. Дано натуральное числа T, которое представляет длительность прошедшего времени в секундах.
        // Вывести данное значение длительности в часах, минутах и секундах в следующей форме: HHч MM мин SSс

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of seconds: ");
        int t = scanner.nextInt();
        int hours = t / 3600;
        int minutes = (t % 3600) / 60;
        int seconds = (t % 3600) % 60;

        System.out.printf("%02dч ", hours);
        System.out.printf("%02d мин ", minutes);
        System.out.printf("%02dс ", seconds);
    }
}