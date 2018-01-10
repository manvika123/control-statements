import java.util.Scanner;

public class futureday {
    public static void main(String[] args) {
int num;
        System.out.println("enter today ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.print("today is ");
        switch(num) {
            case 0:
                System.out.println("sun");
                break;
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tues");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thurs");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
        }
        int num1= num+1;
        System.out.print("the future day is ");
        switch(num1) {
            case 0:
                System.out.println("sun");
                break;
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tues");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thurs");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
        }
    }
}
