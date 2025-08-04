/*
    Note:- If we are initializing any variable then keep remember that in interface we have 
    to initialize all the variables with values because by default they are final or static.
*/
// interface Box          
// {
//     int num = 3;   // final or static
//     int area = 9;

//     void square();
//     void square3d();
// }

// class Shape implements Box
// {
//     public void square()
//     {
//         System.out.println(2*2);
//     }

//     public void square3d()
//     {
//         System.out.println(3*3);
//         System.out.println("Num: "+num);
//         System.out.println("Area: "+area);
//     }
// }

// public class InterfaceClass {
//     public static void main(String[] args) {
//         Shape obj = new Shape();
//         obj.square();
//         obj.square3d();
//     }
// }

// **************************** MULTIPLE INTERFACE *****************************
// interface Computer         
// {
//     void code();
//     void software();
// }

// interface Phones
// {
//     void call();
//     void connect();
// }

// class Technology implements Computer,Phones
// {
//     public void code()
//     {
//         System.out.println("Coding..");
//     }

//     public void software()
//     {
//         System.out.println("Building a Software");
//     }

//     public void call()
//     {
//         System.out.println("Calling..");
//     }
//     public void connect()
//     {
//         System.out.println("Connecting with the world");
//     }
// }

// public class InterfaceClass {
//     public static void main(String[] args) {
//         Technology obj = new Technology();
//         obj.code();
//         obj.software();
//         obj.call();
//         obj.connect();
//     }
// }

// **************************** USE OF INTERFACE IN JAVA *************************
/*
    Interface helps us to store an abstract class by default. And then we can implement 
    our method afterwards using new class.
*/
interface Computer         
{
    void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("Code, build and run..");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("Code, build and run but more faster..");
    }
}

class Developer extends Desktop
{
    public void coder(Computer comp)
    {
        comp.code();
    }
}

public class InterfaceClass {
    public static void main(String[] args) {
        // Laptop obj1 = new Laptop();

        Desktop obj2 = new Desktop();

        Developer obj = new Developer();
        // obj.coder(obj1);
        obj.coder(obj2);
    }
}
