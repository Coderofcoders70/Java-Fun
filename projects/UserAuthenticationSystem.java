import java.util.Scanner;

public class UserAuthenticationSystem {
    public static void main(String[] args) {
        // Hard Code Values.
        String validUsername = "useradmin";
        String validPassword = "user123";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Simple User Authentication System");
        System.out.print("Enter your username: ");
        String user = sc.nextLine();
        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        if (user.equals(validUsername) && pass.equals(validPassword)) {
            System.out.println("Welcome User, You have successfully understand java programming");
        }
        else
        {
            System.out.println("Oops!! Invalid Credentials");
        }
    }
}
