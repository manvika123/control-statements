import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        int totalstudents, highestscore=0;
        String highestscorename="";
        Scanner sc=  new Scanner(System.in);
        System.out.println("enter the total number of students");
        totalstudents = sc.nextInt();

        System.out.println("enter the student name and score");

        for(int i=0;i<totalstudents;i++)
        {
            System.out.print("Student: "+(i+1)+"\nName: ");

            String name= sc.next();
            System.out.print("Score: ");
            int score= sc.nextInt();

            if(score>highestscore)
            {
                highestscore= score;
                highestscorename= name;
            }
        }
        System.out.println("the highest score is "+highestscore+" and student is "+highestscorename);
    }
}

