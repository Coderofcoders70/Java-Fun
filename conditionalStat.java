// *************************** IF CONDITION *************************
// public class conditionalStat
// {
//     public static void main(String args[])
//     {
//         int x = 8;

//         if(x < 10)
//         System.out.println(x);
//     }
// }

// **************************** IF-ELSE CONDITION - 1**********************
// public class conditionalStat
// {
//     public static void main(String args[])
//     {
//         int x = 8;

//         if(x < 10)
//         System.out.println(x);
//         else
//         System.out.println("x is larger than the given value");
//     }
// }

// **************************** IF-ELSE CONDITION - 2**********************
// public class conditionalStat
// {
//     public static void main(String args[])
//     {
//         int x = 20;
//         int y = 10;

//         if(x < y) // Use curly-brackets when you use more than one variable 
//         {
//             System.out.println(x);
//         }
//         else
//         {
//             System.out.println(y);
//         }
//     }
// }

// **************************** NESTED IF CONDITION **********************
// public class conditionalStat
// {
//     public static void main(String args[])
//     {
//         // larger element
//         int x = 10;
//         int y = 20;
//         int z = 30;

//         if(x > z)
//         {
//             if(x > y)
//             {
//                 System.out.println(x);
//             }
//             else
//             {
//                 System.out.println(y);
//             }
//         }
//         else
//         {
//             System.out.println(z);
//         }
//     }
// }

// **************************** IF ELSE-IF CONDITION **********************
// public class conditionalStat
// {
//     public static void main(String args[])
//     {
//         // larger element
//         int x = 10;
//         int y = 20;
//         int z = 30;

//         if(x > y)
//         {
//             if(x > z)
//             {
//                 System.out.println(x);
//             }
//             else
//             {
//                 System.out.println(z);
//             }
//         }
//         else if(y > z)
//         {
//             System.out.println(y);
//         }
//         else
//         {
//             System.out.println(z);
//         }
//     }
// }

// **************************** TERNARY OPERATOR **********************
// public class conditionalStat
// {
//     public static void main(String args[])
//     {
//         int x = 10;
        
//         boolean result = (x == 20) ? true : false;
//         System.out.println(result);
//     }
// }

// **************************** SWITCH STATEMENT **********************
// public class conditionalStat
// {
//     public static void main(String args[])
//     {
//         int day = 5;
        
//         switch(day){

//             case 1: 
//                 System.out.println("Monday");
//                 break;
//             case 2: 
//                 System.out.println("Tuesday");
//                 break;
//             case 3: 
//                 System.out.println("Wednesday");
//                 break;
//             case 4: 
//                 System.out.println("Thursday");
//                 break;
//             case 5: 
//                 System.out.println("Friday");
//                 break;
//             case 6: 
//                 System.out.println("Saturday");
//                 break;
//             case 7: 
//                 System.out.println("Sunday");
//                 break;
//             default : 
//                 System.out.println("Please enter the correct day");
//         }
//     }
// }