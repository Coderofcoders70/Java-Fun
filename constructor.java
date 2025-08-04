// ******************** CONSTRUCTOR **********************
// class Students
// {
//     int rollNo;
//     String name;

//     public Students() // Constructor of the class. Constructor name is always as same as the
//     // name of the class. 
//     {
//         rollNo = 1;
//         name = "Lakshaya Sharma";
//     }
// }

// public class constructor {
//     public static void main(String[] args) {
//         Students stud1 = new Students();
//         System.out.println("Roll No: "+stud1.rollNo);
//         System.out.println("Name: "+stud1.name);
//     }
// }

// ******************** DEFAULT CONSTRUCTOR **********************
// class Students
// {
//     int rollNo;
//     String name;

//     public Students() 
//     {
//         System.out.println("This is the example of Default Constructor");
//     }
// }

// public class constructor {
//     public static void main(String[] args) {
//         Students stud1 = new Students();
//     }
// }

// ******************** PARAMETERIZED CONSTRUCTOR **********************
// class Students
// {
//     int rollNo;
//     String name;

//     public Students(int r, String n) 
//     {
//         rollNo = r;
//         name = n;
//     }
// }

// public class constructor {
//     public static void main(String[] args) {
//         Students stud1 = new Students(1,"Lakshaya Sharma");
//         System.out.println("Roll No. "+stud1.rollNo);
//         System.out.println("Name: "+stud1.name);
//     }
// }

// ********************** EXTENDS KEYWORD *******************
// class A
// {
//     public A()
//     {
//         System.out.println("This is A");
//     }
// }

// class B extends A
// {
//     public B()
//     {
//         System.out.println("This is B");
//     }
// }

// public class constructor
// {
//     public static void main(String args[])
//     {
//         B obj = new B();
//     }
// }

// ********************** SUPER KEYWORD = 1 *******************
// class A
// {
//     public A() 
//     {
//         super(); // Super keyword is by default there in the constructor but it is hidden.
//         System.out.println("This is A");
//     }
//     public A(int n)
//     {
//         super();
//         System.out.println("This is int A");
//     }
// }

// class B extends A
// {
//     public B()
//     {
//         super();
//         System.out.println("This is B");
//     }

//     public B(int n)
//     {
//         super();
//         System.out.println("This is int B");
//     }
// }

// public class constructor
// {
//     public static void main(String args[])
//     {
//         B obj = new B(5);
//     }
// }

// ********************** SUPER KEYWORD - 2 *******************
// class A
// {
//     public A() 
//     {
//         super(); 
//         System.out.println("This is A");
//     }
//     public A(int n)
//     {
//         super();
//         System.out.println("This is int A");
//     }
// }

// class B extends A
// {
//     public B()
//     {
//         super();
//         System.out.println("This is B");
//     }

//     public B(int n)
//     {
//         super(5);
//         System.out.println("This is int B");
//     }
// }

// public class constructor
// {
//     public static void main(String args[])
//     {
//         B obj = new B(5);
//     }
// }

// ********************** THIS KEYWORD *******************
// class A
// {
//     public A() 
//     {
//         super(); 
//         System.out.println("This is A");
//     }
//     public A(int n)
//     {
//         super();
//         System.out.println("This is int A");
//     }
// }

// class B extends A
// {
//     public B()
//     {
//         super();
//         System.out.println("This is B");
//     }

//     public B(int n)
//     {
//         this();
//         System.out.println("This is int B");
//     }
// }

// public class constructor
// {
//     public static void main(String args[])
//     {
//         B obj = new B(5);
//     }
// }

// ******************************* IMPORTANT TO READ ***************************** 
/*
    Now a question arises if class B extends class A then what does class A extends. So, by 
    default every class extends "Object". But this is also hidden.
*/
// class A extends Object
// {
//     public A() 
//     {
//         super(); 
//         System.out.println("This is A");
//     }
//     public A(int n)
//     {
//         super();
//         System.out.println("This is int A");
//     }
// }

// class B extends A
// {
//     public B()
//     {
//         super();
//         System.out.println("This is B");
//     }

//     public B(int n)
//     {
//         this();
//         System.out.println("This is int B");
//     }
// }

// public class constructor
// {
//     public static void main(String args[])
//     {
//         B obj = new B(5);
//     }
// }