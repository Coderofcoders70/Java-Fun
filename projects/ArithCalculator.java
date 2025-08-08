// import java.util.Scanner;

// class Calculations
// {
//     public int Calc(int a, int b, int c)
//     {   
//         if (c == 1) {
//             return a + b;
//         }

//         else if (c == 2) {
//             return a - b;
//         }

//         else if (c == 3) {
//             return a * b;
//         }

//         else if (c == 4) {
//             return a / b;
//         }

//         else if (c == 5) {
//             return a % b;
//         }

//         else{
//             return 0;
//         }

//     }
// }

// public class ArithCalculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("***Simple Calculator***");
//         System.out.print("Enter a value: ");
//         int a = sc.nextInt();
        
//         System.out.print("Enter another value: ");
//         int b = sc.nextInt();

//         System.out.println("Choose the operation you want to perform:-");
//         System.out.println("1. Addition");
//         System.out.println("2. Subtraction");
//         System.out.println("3. Multiplication");
//         System.out.println("4. Division");
//         System.out.println("5. Modulus");

//         System.out.print("Enter number from the above: ");
//         int c = sc.nextInt();

//         Calculations obj = new Calculations();
//         int res = obj.Calc(a, b, c);   
//         System.out.println("Result: "+res);
//     }
// }
