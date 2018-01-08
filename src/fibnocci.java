public class fibnocci {
    public static void main(String[] args) {

        int a = 0, b = 1, c = 0;
        System.out.print(a+","+b);
        int limit = 20;
        while (limit!=0) {
            c = a + b;
            System.out.print(","+c);
            a = b;
            b = c;
            limit--;
        }

    }
}