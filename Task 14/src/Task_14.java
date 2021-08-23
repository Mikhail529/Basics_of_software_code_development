public class CLS {
    public static void main(String[] args) {

        // Task 14. Найти сумму квадратов первых ста чисел

        int x = 0;
        int sum = 0;

        for (int i=0; i<100; i++) {
            x++;
            sum += Math.pow(x, 2);
        }
        System.out.println("Сумма квадратов первых ста чисел равна: " + sum);
    }
}