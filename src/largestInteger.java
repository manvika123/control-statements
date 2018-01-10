import static java.lang.Math.pow;

public class largestInteger {
    public static void main(String[] args) {

        int n=0,temp=0;

        while(n<12000)
        {
            if(pow(n,3)<12000)
            {
                temp=n;
            }
         n++;
        }
        System.out.println("The largest number is "+temp);
    }

}
