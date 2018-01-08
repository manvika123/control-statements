import java.util.Scanner;

public class largestamongall {
    public static void main(String[] args) {

        int a,b,c,big;

        Scanner sc= new Scanner(System.in);
        System.out.print("a= ");
        a=sc.nextInt();
        System.out.print("b= ");
        b=sc.nextInt();
        System.out.print("c= ");
        c=sc.nextInt();
        big = a > b ? ( a > c ? a : c) : (b > c ? b : c) ;
        System.out.println("largest number is "+ big);
    }
}

