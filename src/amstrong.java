import java.util.Scanner;

import static java.lang.Math.pow;

public class amstrong {
    public static void main(String[] args) {

        int num,count =0,rem,rem1,sum=0,n1,n;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
         n=num;
       while(n!=0)
       {
           rem = n%10;
           count++;
           n= n/10;
       }
       n1= num;
            while(n1!=0)
            {
           rem1= n1%10;
           sum = sum + (int)pow(rem1,count);
           n1 =n1/10;
       }
       if(sum==num)
        System.out.println("number is amstrong");
       else
           System.out.println("number is not amstrong");
    }
}
