import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {


        int rows=5, i, j, space;

        for(i=rows; i>=1; --i)
        {
            for(space=0; space < rows-i; ++space)
                System.out.print("  ");

            for(j=i; j <= 2*i-1; ++j)
                System.out.print("* ");

            for(j=0; j < i-1; ++j)
                System.out.print("* ");

            System.out.println();
        }

    }
}
