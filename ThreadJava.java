// *************************** THREAD USING EXTENDS KEYWORD *******************************
// class A extends Thread
// {
//     public void run()
//     {
//         for (int i = 0; i < 100; i++) {
//             System.out.println("Hello World!");
//             try {
//                 Thread.sleep(100);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B extends Thread
// {
//     public void run()
//     {
//         for (int i = 0; i < 100; i++) {
//             System.out.println("This is the Thread concept");
//             try {
//                 Thread.sleep(100);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class ThreadJava {
//     public static void main(String[] args) {
        
//         A obj1 = new A();
//         B obj2 = new B();

//         obj1.start(); 
//         obj2.start();
//     }
// }

// ***************************** THREAD USING IMPLEMENTS *********************************
// class A implements Runnable
// {
//     public void run()
//     {
//         for (int i = 0; i < 100; i++) {
//             System.out.println("Hello World!");
//             try {
//                 Thread.sleep(100);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable
// {
//     public void run()
//     {
//         for (int i = 0; i < 100; i++) {
//             System.out.println("This is the Thread concept");
//             try {
//                 Thread.sleep(100);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// public class ThreadJava {
//     public static void main(String[] args) {
        
//         // A obj1 = new A();
//         Runnable obj1 = new A();
//         // B obj2 = new B();
//         Runnable obj2 = new B();

//         Thread t1 = new Thread(obj1);
//         Thread t2 = new Thread(obj2);

//         t1.start(); 
//         t2.start();
//     }
// }

// ***************************** THREAD USING LAMBDA EXPRESSION ***************************
// public class ThreadJava {
//     public static void main(String[] args) {
    
//         Runnable obj1 = () -> {
//             for(int i = 0; i < 5; i++)
//             {
//                 System.out.println("Hello World!");
//             }
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         };

//         Runnable obj2 = () -> {

//             for(int i = 0; i < 5; i++)
//             {
//                 System.out.println("This is the thread concept");
//             }
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         };

//         Thread t1 = new Thread(obj1);
//         Thread t2 = new Thread(obj2);

//         t1.start(); 
//         t2.start();
//     }
// }

// ********************************* MULTIPLE THREADING ***********************************
// class Counter
// {
//     int count;
//     public synchronized void counts()
//     {
//         count++;
//     }
// }

// public class ThreadJava {
//     public static void main(String[] args) {
    
//         Counter c = new Counter();

//         Runnable obj1 = () -> {
//             for(int i = 0; i < 1000; i++)
//             {
//                 c.counts();        
//             }
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         };

//         Runnable obj2 = () -> {

//             for(int i = 0; i < 1000; i++)
//             {
//                 c.counts();
//             }
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         };

//         Thread t1 = new Thread(obj1);
//         Thread t2 = new Thread(obj2);

        
//         t1.start(); 
//         t2.start();
        
//         try
//         {
//             t1.join();
//         }
//         catch(Exception e)
//         {
//             e.printStackTrace();
//         }

//         try
//         {
//             t2.join();
//         }
//         catch(Exception e)
//         {
//             e.printStackTrace();
//         }

//         System.out.println(c.count);
//     }
// }