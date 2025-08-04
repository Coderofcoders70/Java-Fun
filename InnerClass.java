// class Mammal
// {
//     public void mammals()
//     {
//         System.out.println("Mammalia is a class");
//     }

//     class Human
//     {
//         public void humanbeings()
//         {
//             System.out.println("We are human beings");
//         }
//     }
// }

// public class InnerClass {
//     public static void main(String[] args) {
//         Mammal obj = new Mammal();
//         obj.mammals();
    
//         Mammal.Human obj1 = obj.new Human();
//         obj1.humanbeings();
//     }
// }

// *************************** STATIC INNER CLASS *****************************
// class Mammal
// {
//     public void mammals()
//     {
//         System.out.println("Mammalia is a class");
//     }

//     static class Human
//     {
//         public void humanbeings()
//         {
//             System.out.println("We are human beings");
//         }
//     }
// }

// public class InnerClass {
//     public static void main(String[] args) {
//         Mammal obj = new Mammal();
//         obj.mammals();

//         Mammal.Human obj1 = new Mammal.Human();
//         obj1.humanbeings();
//     }
// }

// *************************** ANONYMOUS INNER CLASS *****************************
// class Human
// {
//     public void humanbeings()
//     {
//         System.out.println("We are human beings");
//     }
// }

// public class InnerClass {
//     public static void main(String[] args) {
//         Human obj = new Human()
//         {
//             public void humanbeings()
//             {
//                 System.out.println("We can sense");
//             }
//         };
//         obj.humanbeings();
//     }
// }
