import java.util.Scanner;

public class integers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int positives=0;
        int negatives=0;
        int count=0,cp=0,cn=0;
        int total=0;
        System.out.println("Enter the integer and input ends if number is 0 : ");
        int number= sc.nextInt();

        if(number==0)
        {
            System.out.println("0 entered hence program ends");
            System.exit(1);
        }

        while(number!=0)
        {
            if(number>0) {
                positives++;
                cp++;
            }
            else {
                negatives++;
                cn++;
            }
            total=total+number;
            count++;
            number= sc.nextInt();
        }
       double average= total/count;
        System.out.println("the number of positive numbers are "+cp+" and the number of negative numbers are "+cn);
        System.out.println("The total is "+total+" and average is "+average);
    }
}
