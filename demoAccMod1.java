import accessMod.*;
// import accessMod.operations.*;


class B extends Demo
{
    public void showMarks()
    {
        B obj = new B();
        System.out.println(obj.marks);
    }
}

public class demoAccMod1{
    public static void main(String[] args) {
        Calc obj = new Calc();
        int res = obj.add(2, 2);  
        System.out.println(res);      

        // Demo obj1 = new Demo();
        // System.out.println(obj1.marks);

        DemoAccMod2 obj2 = new DemoAccMod2();
        System.out.println(obj2.marks);
    }
}
