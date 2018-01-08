import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int num,n,rem,sum=0;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        n=num;

        while(n!=0)
        {
           rem= n%10;
           sum= (sum*10)+rem;
           n= n/10;
        }
        if(sum==num)
            System.out.println("the number is palindrome");
        else
            System.out.println("the number is not palindrome");
    }
}
