import java.util.Scanner;

public class swapagn {
    public static void main(String[] args) {
        int x,y;
        System.out.println("enter a and b");
        Scanner sc= new Scanner(System.in);
        x= sc.nextInt();
        y= sc.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;


        System.out.println("x ="+x+" "+"y="+y);

    }
}
