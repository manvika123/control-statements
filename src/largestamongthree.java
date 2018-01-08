import java.util.Scanner;

public class largestamongthree {
    public static void main(String[] args) {
        int a,b,c;

        Scanner sc= new Scanner(System.in);
        System.out.print("a= ");
        a=sc.nextInt();
        System.out.print("b= ");
        b=sc.nextInt();
        System.out.print("c= ");
        c=sc.nextInt();

        if(a>b)
        {
            if(a>c)
                System.out.println("a is largest");
            else
                System.out.println("c is largest");
        }
        else
        {
            if(b>c)
                System.out.println("b is largest");
            else
                System.out.println("c is largest");
        }
    }




}

