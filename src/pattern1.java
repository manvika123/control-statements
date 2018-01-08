public class pattern1 {
    public static void main(String[] args) {
        int t=1;
        for (int i=1; i<=5; i++)
        {
            for (int k=t; k<5; k++)
            {
                System.out.print(" ");
            }
            for (int j=0; j< i; j++)
            {
                System.out.print(" * ");
                t = t + 1;
            }
            System.out.println();
        }
    }
}
