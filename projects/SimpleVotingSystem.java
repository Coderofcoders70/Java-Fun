import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleVotingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;
        
        System.out.println("Welcome to the Voting System");
        System.out.println("Are you a Candidate or Voter ?");
        System.out.println("Press C for candidate");
        System.out.println("Press v for voter");
        System.out.print("Enter here: ");
        c = sc.nextLine().charAt(0);
        if(c == c)
        {
            List<String> cand = new ArrayList<String>();
            cand.add("Deepak");
            cand.add("Jayesh");
            cand.add("Suresh");
            cand.add("Venkat");
            cand.add("Suraj");
            
            System.out.println("Do you want to add your name ?");
            System.out.println("Enter your name: ");
            String input = sc.nextLine();
            cand.add(input);
            System.out.println("Our promising Leaders name are:-");
            System.out.println(cand);
            System.out.println("Your name added successfully");
        }
    }
}
