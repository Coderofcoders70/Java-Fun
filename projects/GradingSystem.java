import java.util.Scanner;

class Grades
{
    public static void getGrades(int marks)
    {   
        if (marks >= 90) {
            System.out.println("Grade: A");
        }
        else if (marks >= 80 && marks < 90) {
            System.out.println("Grade: B");
        }
        else if (marks >= 70 && marks < 80) {
            System.out.println("Grade: C");
        }
        else if (marks >= 60 && marks < 70) {
            System.out.println("Grade: D");
        }
        else
        {
            System.out.println("Practice more.");
        }
    }
}

public class GradingSystem {
    public static void main(String[] args) {
        int marks = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your marks: ");
        marks = sc.nextInt();

        Grades obj = new Grades();
        obj.getGrades(marks);
    }
}
