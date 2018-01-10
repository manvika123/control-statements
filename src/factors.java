import java.util.Scanner;

public class factors {
    public static void main(String[] args) {

        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        num =sc.nextInt();

        for(int i=2; i<=num; i++)
        {
            if(num%i==0)
                System.out.print(i+" ");
        }
    }
}
