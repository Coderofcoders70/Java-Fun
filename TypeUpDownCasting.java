// ****************************** TYPECASTING *************************
// public class TypeUpDownCasting {
//     public static void main(String[] args) {
        
//         double d = 4.5;
//         int num = (int) d; // Typecasting

//         System.out.println(num);
//     }
// }

// ****************************** UPCASTING *************************
// class A
// {
//     public void show1()
//     {
//         System.out.println("This is show A");
//     }
// }

// class B extends A
// {
//     public void show2()
//     {
//         System.out.println("This is show B");
//     }
// }

// public class TypeUpDownCasting
// {
//     public static void main(String[] args) {
//         // A obj = new B();
//         // obj.show1();

//         // or

//         A obj = (A) new B();
//         obj.show1();
//     }
// }

// ****************************** DOWNCASTING *************************
// class A
// {
//     public void show1()
//     {
//         System.out.println("This is show A");
//     }
// }

// class B extends A
// {
//     public void show2()
//     {
//         System.out.println("This is show B");
//     }
// }

// public class TypeUpDownCasting
// {
//     public static void main(String[] args) {
//         A obj1 = new B();
//         obj1.show1();

//         B obj2 = (B) obj1; // DownCasting
//         obj2.show2();
//     }
// }