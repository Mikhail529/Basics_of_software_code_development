import java.math.BigInteger;

public class CLS {
    public static void main(String[] args) {

        // Task 15. Составить программу нахождения произведения квадратов первых двухсот чисел

        BigInteger s = BigInteger.valueOf(1);

        for (int i=1; i<=200; i++) {
            int tmp = (int)Math.pow(i, 2);
            s = s.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println(s);
    }
}