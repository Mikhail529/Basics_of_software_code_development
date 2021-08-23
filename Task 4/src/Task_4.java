import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        //Task 4. Дано дествительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
        // Поменять местами дробную и целую части числа и вывести полученое значение числа

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value in the Format \"nnn.ddd\": ");
        double r = scanner.nextDouble();

        System.out.println("The result is: " + ( (r*1000) % 1000 + (int)r / 1000.000) );
    }
}