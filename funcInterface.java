// ************************************ ANNOTATIONS *************************************
/* 
    Annotations are the message which indicates us or gives warning if their is a mistake in
    any method.
*/
// class A
// {
//     public void show()
//     {
//         System.out.println("This is show method A");
//     }
// }

// class B extends A
// { 
//     @Override
//     public void show()
//     {
//         System.out.println("This is show method B");
//     } 
// }

// public class funcInterface {
//     public static void main(String[] args) {
//         B obj = new B();
//         obj.show();
//     }
// }

// ******************************** FUNCTIONAL INTERFACE *********************************
/*
    A Functional interface is a single interface.
*/
// @FunctionalInterface
// interface A
// {
//     void show();
// }

// public class funcInterface {
//     public static void main(String[] args) {
//         A obj = new A() 
//         {
//             public void show()
//             {
//                 System.out.println("This is Functional Interface method example");
//             }    
//         }; 

//         obj.show();
//     }
// }

// *********************************** LAMBDA EXPRESSION *********************************
/*
    Lambda expression is basically used to define a function in more easier and simpler way 
    by using a simple (->) expression. This arrow sign in java is know as Lambda Expression.
    Bu do remember this type of expression can only be used with functional interface.
*/
// @FunctionalInterface
// interface A
// {
//     void show();
// }

// public class funcInterface {
//     public static void main(String[] args) {
//         A obj = () -> System.out.println("This is Functional Interface method example");

//         obj.show();
//     }
// }

// Another example:-
// @FunctionalInterface
// interface A
// {
//     int add(int a, int b);
// }

// public class funcInterface {
//     public static void main(String[] args) {
//         A obj = (a,b) -> a + b;
//         int res = obj.add(5,7);
//         System.out.println(res);
//     }
// }
