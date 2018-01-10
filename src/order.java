import java.util.Scanner;

public class order {
    public static void main(String[] args) {

        int a, b, c;
        System.out.println("enter a, b, c");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();


        if ((a >= b) && (a >= c)) {
            if (b >= c) {
                System.out.println("c,b,a");
            } else {
                System.out.println("b,c,a");
            }
        } else if ((b >= a) && (b >= c)) {
            if (a >= c) {
                System.out.println("c,a,b");
            } else {

                System.out.println("a,c,b");
            }
        } else if ((c >= a) && (c >= b)) {
            if (a >= b) {
                System.out.println("b,a,c");
            } else {
                System.out.println("a,b,c");
            }
        }
    }
}