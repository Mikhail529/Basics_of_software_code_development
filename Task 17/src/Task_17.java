public class CLS {
    public static void main(String[] args) {

        // Task 17. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера

        for (int i=33; i<127; i++) {
            System.out.println(i + "  \t-\t  " + (char)i);
        }
    }
}