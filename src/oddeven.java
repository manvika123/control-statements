import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {

        int num;
        Scanner sc= new Scanner(System.in);
        num =sc.nextInt();

        if(num%2==0)
            System.out.println("the number is even");
        else
            System.out.println("the number is odd");
    }
}
