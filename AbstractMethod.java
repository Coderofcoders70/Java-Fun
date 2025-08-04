// ***************************** ABSTRACT METHOD - 1 **********************************
// abstract class Car
// {
//     public abstract void drive();
//     public abstract void playMusic();
// }

// class CarManufacture extends Car        // Concrete class
// {
//     public void drive()
//     {
//         System.out.println("Driving....");
//     }

//     public void playMusic()
//     {
//         System.out.println("Playing Music");
//     }
// }

// public class AbstractMethod {
//     public static void main(String[] args) {
//         CarManufacture obj = new CarManufacture();
//         obj.drive();
//         obj.playMusic();
//     }
// }

// ***************************** ABSTRACT METHOD - 2 *****************************
// abstract class Car
// {
//     public abstract void drive();
    
//     public void playMusic()
//     {
//         System.out.println("Playing Music");
//     }
// }

// class CarManufacture extends Car         // Concrete class 
// {
//     public void drive()
//     {
//         System.out.println("Driving....");
//     }
// }

// public class AbstractMethod {
//     public static void main(String[] args) {
//         CarManufacture obj = new CarManufacture();
//         obj.drive();
//         obj.playMusic();
//     }
// }

// ************************** ANONYMOUS INNER CLASS USING ABSTRACT *******************
// abstract class Car
// {
//     public abstract void drive();
//     public abstract void playMusic();
// }

// public class AbstractMethod {
//     public static void main(String[] args) {
//         Car obj = new Car()
//         {
//             public void drive()
//             {
//                 System.out.println("Driving..");
//             }

//             public void playMusic()
//             {
//                 System.out.println("Music is playing");
//             }
//         };

//         obj.drive();
//         obj.playMusic();
//     }
// }
