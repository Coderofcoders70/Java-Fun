// import java.util.Scanner;
// import java.util.Random;
// ********************** 1-D ARRAY ************************
// public class arrays {
//     public static void main(String[] args) {
//         int nums[] = {3,4,5,6};

//         System.out.println(nums[0]);
//         System.out.println(nums[1]);
//         System.out.println(nums[2]);
//         System.out.println(nums[3]);
//     }
// }

// public class arrays {
//     public static void main(String[] args) {
//         int nums[] = new int[4];
//         nums[0] = 3;
//         nums[1] = 4;
//         nums[2] = 5;
//         nums[3] = 6;

//         System.out.println(nums[0]);
//         System.out.println(nums[1]);
//         System.out.println(nums[2]);
//         System.out.println(nums[3]);
//     }
// }

// public class arrays {
//     public static void main(String[] args) {
//         int nums[] = new int[4];

//         Scanner scann = new Scanner(System.in);
//         for (int i = 0; i < nums.length; i++) {
//             System.out.print("Enter the "+(i+1)+" value: ");
//             nums[i] = scann.nextInt();
//         } 

//         for (int i = 0; i < nums.length; i++) {
//             System.out.println(nums[i]);
//         }   
//     }
// }

// ********************** 2-D ARRAYS ************************
// public class arrays {
//     public static void main(String[] args) {
//         int nums[][] = new int [2][3];

//         Scanner scann = new Scanner(System.in);
//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 3; j++) {
//                 System.out.print("Enter the "+(i+1)+" value: ");
//                 nums[i][j] = scann.nextInt();
//             }
//         } 

//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 3; j++) {
//                 System.out.print(nums[i][j] + " ");
//             }
//             System.out.println();
//         }   
//     }
// }

// public class arrays {
//     public static void main(String[] args) {
//         int nums[][] = new int [2][3];

//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 3; j++) {
//                 nums[i][j] = (int)(Math.random() * 10);
//             }
//         } 

//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 3; j++) {
//                 System.out.print(nums[i][j] + " ");
//             }
//             System.out.println();
//         }   
//     }
// }

// ********************** ENHANCED FOR LOOP ************************
// public class arrays {
//     public static void main(String[] args) {
//         int nums[][] = new int [2][3];

//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 3; j++) {
//                 nums[i][j] = (int)(Math.random() * 10);
//             }
//         } 

//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 3; j++) {
//                 System.out.print(nums[i][j] + " ");
//             }
//             System.out.println();
//         }   
        
//         for (int n[] : nums) { // Work similarly like the piece of code above.
//             for (int j : n) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }   
//     }
// }

// ********************** JAGGED ARRAY ************************
// public class arrays {
//     public static void main(String[] args) {
//         int nums[][] = new int [2][];
//         nums[0] = new int[3];
//         nums[1] = new int[4];

//         for (int i = 0; i < nums.length; i++) {
//             for (int j = 0; j < nums[i].length; j++) {
//                 nums[i][j] = (int)(Math.random() * 10);
//             }
//         }   
        
//         for (int n[] : nums) { 
//             for (int j : n) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }   
//     }
// }

// public class arrays {
//     public static void main(String[] args) {
//         Scanner scann = new Scanner(System.in);
//         int nums[][] = new int [2][];
//         nums[0] = new int[3];
//         nums[1] = new int[4];

//         for (int i = 0; i < nums.length; i++) {
//             for (int j = 0; j < nums[i].length; j++) {
//                 System.out.print("Enter the "+(i+1)+" value: ");
//                 nums[i][j] = scann.nextInt();
//             }
//         }   
        
//         for (int n[] : nums) { 
//             for (int j : n) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }   
//     }
// }

// ********************** 3-D ARRAYS ************************
// public class arrays {
//     public static void main(String[] args) {
//         Scanner scann = new Scanner(System.in);
//         int nums[][][] = new int [2][2][2];

//         for (int i = 0; i < nums.length; i++) {
//             for (int j = 0; j < nums[i].length; j++) {
//                 for (int k = 0; k < nums[j].length; k++) {
//                     System.out.print("Enter the ["+i+"]["+j+"]["+k+"]"+" value: ");
//                     nums[i][j][k] = scann.nextInt();
//                 }
//             }
//         }   
        
//         for (int n[][] : nums) { 
//             for (int j[] : n) {
//                 for(int k : j){
//                     System.out.print(k + " ");
//                 }
//             }
//             System.out.println();
//         }   
//     }
// }

// public class arrays {
//     public static void main(String[] args) {
//         Scanner scann = new Scanner(System.in);
//         int nums[][][] = new int [2][2][2];

//         for (int i = 0; i < nums.length; i++) {
//             for (int j = 0; j < nums[i].length; j++) {
//                 for (int k = 0; k < nums[j].length; k++) {
//                     nums[i][j][k] = (int)(Math.random() * 10);
//                 }
//             }
//         }   
        
//         for (int n[][] : nums) { 
//             for (int j[] : n) {
//                 for(int k : j){
//                     System.out.print(k + " ");
//                 }
//             }
//             System.out.println();
//         }   
//     }
// }

// class Students
// {
//     int roll_No;
//     String name;
//     int marks;
// }

// public class arrays {
//     public static void main(String[] args) {
//         Students s1 = new Students();
//         s1.roll_No = 101;
//         s1.name = "Lakshaya Sharma";
//         s1.marks = 98;

//         Students s2 = new Students();
//         s2.roll_No = 102;
//         s2.name = "Ritik Sharma";
//         s2.marks = 99;

//         Students s3 = new Students();
//         s3.roll_No = 103;
//         s3.name = "Dungra Ram Choudhary";
//         s3.marks = 100;

//         Students stud[] = new Students[3];
//         stud[0] = s1;
//         stud[1] = s2;
//         stud[2] = s3;
        
//         for (Students st : stud) { 

//             System.out.println(st.roll_No + " Name: "+st.name+" : marks : "+st.marks);
//         }   
//     }
// }