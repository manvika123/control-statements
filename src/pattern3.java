public class pattern3 {
    public static void main(String[] args) {

        int i, space, rows=5, k=0;

        for(i=1; i<=rows; ++i, k=0)
        {
            for(space=1; space<=rows-i; ++space)
            {
                System.out.print("  ");
            }

            while(k != 2*i-1)
            {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
        for(i=rows; i>=1; --i)
        {
            for(space=0; space < rows-i; ++space)
                System.out.print("  ");

            for(int j=i; j <= 2*i-1; ++j)
                System.out.print("* ");

            for(int j=0; j < i-1; ++j)
                System.out.print("* ");

            System.out.println();
        }

    }
}
