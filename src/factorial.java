import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        int num, fact = 1;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = num; i>=1; i--) {
            fact = fact * i;
        }

        System.out.println("factorial of the number is " + fact);
    }
}
