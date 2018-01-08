import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

        int num;
        Scanner sc= new Scanner(System.in);
        num= sc.nextInt();
        int temp=2;
        for(int i=2; i<=(num/2); i++)
        {
            if(num%i==0)
                temp++;
        }
        if(temp==2)
            System.out.println("the number is prime");
        else
            System.out.println("the number is not prime");
    }
}
