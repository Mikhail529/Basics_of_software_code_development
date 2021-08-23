import java.util.Scanner;

public class CLS {
    public static void main(String[] args) {

        // Task 10. Заданы размеры A,B прямоугольного отверстия и размеры x,y,z кирпича.
        // Определить, пройдет ли кирпич через отверстие

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Size of Hole A: ");
        int a = scanner.nextInt();
        System.out.println("Enter a Size of Hole B: ");
        int b = scanner.nextInt();

        System.out.println("Enter a Size of Brick X: ");
        int x = scanner.nextInt();
        System.out.println("Enter a Size of Brick Y: ");
        int y = scanner.nextInt();
        System.out.println("Enter a Size of Brick Z: ");
        int z = scanner.nextInt();

        if (a >= x && b >= y || a >= y && b >= x)
            System.out.println("The Brick Goes Through The Hole");
        else System.out.println("Brick Won't Go Through The Hole");
    }
}