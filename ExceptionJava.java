// public class ExceptionJava {
//     public static void main(String[] args) {
        
//         int i = 2;
//         int j = 0;

//         try
//         {
//             j = 20/i;
//             System.out.println(j);
//         }
//         catch(Exception e)
//         {
//             System.out.println("Something went wrong.." + e);
//         }
//     }
// }

// ************************* MULTIPLE EXCEPTION HANDLING ******************************
/*
    It is really important to remember that if you use multiple exceptions then you should 
    keep the main exception block or the parent block below than all the exception blocks 
    as it can handle all the exceptions. So, if you will try to put the parent block first 
    then the rest of the blocks will generate errors.
*/
// public class ExceptionJava {
//     public static void main(String[] args) {
        
//         int i = 2;
//         int j = 0;
//         String str = "Hello";
//         // String str = null;

//         try
//         {
//             j = 20/i;
//             System.out.println(j);
//             System.out.println(str.length());

//             int nums[] = new int[5];
//             System.out.println(nums[1]);
//             System.out.println(nums[6]);
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println("Cannot be divided..");
//         }
//         catch(ArrayIndexOutOfBoundsException e)
//         {
//             System.out.println("Out of bound array..");
//         }
//         catch(Exception e)
//         {
//             System.out.println("Something went wrong..");
//         }
//     }
// }

// ************************* THROW KEYWORD IN EXCEPTION HANDLING ******************************
// public class ExceptionJava {
//     public static void main(String[] args) {
        
//         int i = 30;
//         int j = 0;

//         try
//         {
//             j = 20/i;
//             System.out.println(j);
//             if (j == 0) 
//                 throw new ArithmeticException("Please put a proper value..");    
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println("Cannot be divided.." + e);
//         }

//         catch(Exception e)
//         {
//             System.out.println("Something went wrong..");
//         }
//     }
// }

// ************************* CREATE YOUR OWN EXCEPTION METHOD *****************************
// class LakshayaException extends Exception
// {
//     public LakshayaException(String str)
//     {
//         super(str);
//     }
// }

// public class ExceptionJava {
//     public static void main(String[] args) {
        
//         int i = 30;
//         int j = 0;

//         try
//         {
//             j = 20/i;
//             System.out.println(j);
//             if (j == 0) 
//                 throw new LakshayaException("Use proper value");    
//         }
//         catch(LakshayaException e)
//         {
//             System.out.println("Cannot be divided.." + e);
//         }

//         catch(Exception e)
//         {
//             System.out.println("Something went wrong..");
//         }
//     }
// }

// ********************************* THROWS KEYWORD ***************************************
// class A
// {
//     public void show() throws ClassNotFoundException
//     {
//         try
//         {
//             Class.forName("ExceptionJava");
//         }
//         catch(ClassNotFoundException e)
//         {
//             System.out.println("Error in finding the class...");
//         }
//     }
// }

// public class ExceptionJava {

//     static{
//         System.out.println("Class found");
//     }
//     public static void main(String[] args) {
        
//         A obj = new A();

//         try
//         {
//             obj.show();
//         }
//         catch(ClassNotFoundException e)
//         {
//             System.out.println("This method is not available");
//             e.printStackTrace();
//         }
//     }
// }

// ********************************* FINALLY KEYWORD **************************************
/*
    Finally keyword helps to print message, value or any kind of output in any way. Whether 
    there is an exception or not.
*/
// public class ExceptionJava {
//     public static void main(String[] args) {
        
//         int i = 10;
//         int j = 0;

//         try
//         {
//             j = 20 / i;
//         }
//         catch(Exception e)
//         {
//             System.out.println("This method is not available");
//         }
//         finally
//         {
//             System.out.println("Value: "+j);
//         }
//     }
// }

/*
    It is a good practice if you close any method after its execution completes. It is not
    compulsory but a good practitioner will always follow the perfection.
*/
// ************************ CLOSE METHOD USING BUFFERED READER - 1 **********************
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class ExceptionJava {
//     public static void main(String[] args) throws IOException {
        
//         int num;
//         BufferedReader br = null;
        
//         try
//         {
//             InputStreamReader ir = new InputStreamReader(System.in);
//             br = new BufferedReader(ir);

//             System.out.print("Enter a number: ");
//             num = Integer.parseInt(br.readLine());
//             System.out.println("Your Value: "+num);
//         }
//         catch(Exception e)
//         {
//             System.out.println("Please Enter a correct Input");
//         }
//         finally
//         {
//             br.close();
//         }
//     }
// }

// ************************ CLOSE METHOD USING BUFFERED READER - 2 **********************
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class ExceptionJava {
//     public static void main(String[] args) throws IOException {
        
//         int num;
//         BufferedReader br = null;
        
//         try
//         {
//             br = new BufferedReader(new InputStreamReader(System.in));

//             System.out.print("Enter a number: ");
//             num = Integer.parseInt(br.readLine());
//             System.out.println("Your Value: "+num);
//         }
//         catch(Exception e)
//         {
//             System.out.println("Please Enter a correct Input");
//         }
//         finally
//         {
//             br.close();
//         }
//     }
// }

// ************************ CLOSE METHOD USING BUFFERED READER - 3 ***********************
/*
    Using this method you won't need to use finally keyword as this method can close the 
    method automatically.
*/
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class ExceptionJava {
//     public static void main(String[] args){
        
//         try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
//         {
//             System.out.print("Enter a number: ");
//             int num = Integer.parseInt(br.readLine());
//             System.out.println("Your Value: "+num);
//         }
//         catch(IOException e)
//         {
//             System.out.println("Please Enter a correct Input");
//         }
//     }
// }