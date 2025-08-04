// enum Status{
//     Running, Success, Failed, Retry, Building;   // constant variables
// }

// public class eNumClass {
//     public static void main(String[] args) {
        
//         Status st = Status.Success;
//         System.out.println(st);
//     }
// }

// ******************************** enum with ARRAY ***************************************
// enum Status{
//     Running, Success, Failed, Retry, Building;   
// }

// public class eNumClass {
//     public static void main(String[] args) {
        
//         Status st[] = Status.values();
//         System.out.println(st[0]);
//     }
// }

// ******************************** enum with ORDINALS ************************************
// enum Status{
//     Running, Success, Failed, Retry, Building;   
// }

// public class eNumClass {
//     public static void main(String[] args) {
        
//         Status st = Status.Building;
//         System.out.println(st.ordinal()); // It returns the index value of the variable
//     }
// }

// ******************************** enum with LOOPS ***************************************
// enum Status{
//     Running, Success, Failed, Retry, Building;   
// }

// public class eNumClass {
//     public static void main(String[] args) {
        
//         Status st[] = Status.values();
        
//         for(Status ss : st)
//         {
//             System.out.println(ss+" : "+ss.ordinal());
//         }
//     }
// }

// ******************************** enum USING IF-ELSE ***************************************
// enum Status{
//     Running, Success, Failed, Retry, Building;   
// }

// public class eNumClass {
//     public static void main(String[] args) {
        
//         Status st = Status.Running;

//         if (st == Status.Running) {
//             System.out.println("Running..");
//         }
//         else if (st == Status.Building) {
//             System.out.println("Building..");
//         }
//         else if (st == Status.Retry) {
//             System.out.println("Retry Again..");
//         }
//         else if (st == Status.Success) {
//             System.out.println("Success..");
//         }
//         else{
//             System.out.println("Failed..");
//         }
//     }
// }

// ******************************** enum USING SWITCH CASE ********************************
// enum Status{
//     Running, Success, Failed, Retry, Building;   
// }

// public class eNumClass {
//     public static void main(String[] args) {
        
//         Status st = Status.Running;

//         switch (st) {
//             case Running:
//                 System.out.println("Running...");
//                 break;
//             case Building:
//                 System.out.println("Building...");
//                 break;
//             case Retry:
//                 System.out.println("Try Again...");
//                 break;
//             case Failed:
//                 System.out.println("Failed....");
//                 break;

//             default:
//                 System.out.println("Success...");
//                 break;
//         }
//     }
// }

// ******************************** enum CLASS ********************************
// enum Laptop{
//     Lenovo(40000), Asus(50000), MacBook(100000), Samsung(60000), Hcl;   

//     private int price;

//     private Laptop() {
//         price = 30000;
//     }

//     private Laptop(int price) {
//         this.price = price;
//     }

//     public int getPrice()
//     {
//         return price;
//     }

//     public void setPrice(int price)
//     {
//         this.price = price;
//     }
// }

// public class eNumClass {
//     public static void main(String[] args) {
        
//         Laptop lap[] = Laptop.values();
        
//         for(Laptop lt : lap)
//         {
//             System.out.println(lt+":"+lt.getPrice());
//         }
//     }
// }