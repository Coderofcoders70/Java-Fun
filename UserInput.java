// Simple read method to read input from the user:-
// import java.io.IOException;

// public class UserInput {
//     public static void main(String[] args) {
        
//         try {
//             System.out.println("Enter a number: ");
//             int num = System.in.read();
//             System.out.println("Your value: "+(num-48)); // It returns ASCII Value
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }

// // BufferedReader method to read input from the user:-
// import java.io.InputStreamReader;
// import java.io.BufferedReader;
// import java.io.IOException;

// public class UserInput {
//     public static void main(String[] args) {
        
//         try {
//             System.out.println("Enter a number: ");
//             InputStreamReader ir = new InputStreamReader(System.in);
//             BufferedReader br = new BufferedReader(ir);
//             int num = Integer.parseInt(br.readLine()); // By default reads String
//             System.out.println("Your value: "+num);
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }

// Scanner method to read input from the user:-
// import java.util.Scanner;

// public class UserInput {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num = sc.nextInt();
//         System.out.println("Your value: "+num);
//     }
// }

// JOptionPane method 1 to read input from the user:-
// import javax.swing.JOptionPane;

// public class UserInput {
//     public static void main(String[] args) {
        
//         int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
//         System.out.println("Your value: "+num);
//     }
// }

// JOptionPane method 2 to read input from the user:-
// import javax.swing.JOptionPane;

// public class UserInput {
//     public static void main(String[] args){
        
//         String name = JOptionPane.showInputDialog("Enter your name: ");
//         JOptionPane.showMessageDialog(null, "Your Value: "+name);
//     }
// }

// JOptionPane method 3 to read input from the user:-
// import javax.swing.JOptionPane;

// public class UserInput {
//     public static void main(String[] args){
        
//         int result = JOptionPane.showConfirmDialog(null, "Do you want to continue ? ");
//         if (result == JOptionPane.YES_OPTION) {
//             System.out.println("You are a nice human being");
//         }
//         else
//         {
//             System.out.println("You are good for nothing");
//         }
//     }
// }