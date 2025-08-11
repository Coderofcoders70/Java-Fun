import java.util.Scanner;

public class SimpleVotingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cand = {"Deepak", "Jayesh", "Suresh", "Venkat", "Suraj"};
        int[] vote = new int[10];
        char c;
        
        System.out.println("Welcome to the Voting System");
        System.out.println("Are you a Candidate or Voter ?");
        System.out.println("Press C for candidate");
        System.out.println("Press v for voter");
        System.out.print("Enter here: ");
        c = sc.nextLine().charAt(0);
        if(c == 'c' || c == 'C')
        {   
            System.out.println("Do you want to add your name to be candidate?");
            System.out.println("Enter your name: ");
            for(int i = 0; i < cand.length; i++)
            {
                cand[i] = sc.nextLine();
                System.out.println("Your name added successfully");
                System.out.println("\nDo you want to add more name then type Y else N to exit ?");
                System.out.print("Type here: ");
                c = sc.nextLine().charAt(0);
                if (c == 'y' || c == 'Y') {
                    cand[i] = sc.nextLine();
                    System.out.println("Your name added successfully");
                }
                else{
                    break;
                }
            }

            System.out.print("We welcome "+cand[0]+" as our new candidate");
        }
        else if(c == 'v' || c == 'V')
        {
            System.out.println("Name of our candidates are:-");
            System.out.println("1. Deepak");
            System.out.println("2. Jayesh");
            System.out.println("3. Suresh");
            System.out.println("4. Venkat");
            System.out.println("5. Suraj");
            System.out.println("\nRules:");
            System.out.println("Press the serial number of our candidates to vote");
            System.out.println("Press 0 to exit");
            while (true) {
                System.out.print("\nEnter vote: ");
                int choice = sc.nextInt();
                if (choice == 0) {
                    break;
                }

                if (choice >= 1 && choice <= cand.length) {
                    vote[choice-1]++;
                    System.out.println("Vote done successfully");
                }
                else
                {
                    System.out.println("Invalid choice. Please try again");
                }
            }

            System.out.println("\nVote Result:");
            for(int i = 0; i < cand.length; i++)
            {
                System.out.println(cand[i]+": "+vote[i]+" votes");
            }
        }
    }
}
