import java.util.Scanner;

public class months {
    public static void main(String[] args) {

        System.out.println("enter the month number");

        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        switch(num)
        {

            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("mar");
                break;
            case 4:
                System.out.println("apr");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("aug");
                break;
            case 9:
                System.out.println("sept");
                break;
            case 10:
                System.out.println("oct");
                break;
            case 11:
                System.out.println("nov");
                break;
            case 12:
                System.out.println("dec");
                break;

        }
    }
}
