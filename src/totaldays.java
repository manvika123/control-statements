import java.util.Scanner;

public class totaldays {
    public static void main(String[] args) {

        int m,y;
        System.out.println("enter the month and year");
        Scanner sc= new Scanner(System.in);
        m= sc.nextInt();
        y= sc.nextInt();

        if(m==1)
            System.out.println("31 days");
        if(m==2)
        {
            if(y%4==0)
                System.out.println("29 days");
            else
                System.out.println("28 days");
        }
        if(m==3)
            System.out.println("31 days");
        if(m==4)
            System.out.println("30 days");
        if(m==5)
            System.out.println("31 days");
        if(m==6)
            System.out.println("30 days");
        if(m==7)
            System.out.println("31 days");
        if(m==8)
            System.out.println("31 days");
        if(m==9)
            System.out.println("30 days");
        if(m==10)
            System.out.println("31 days");
        if(m==11)
            System.out.println("30 days");
        if(m==12)
            System.out.println("31 days");
    }
}
