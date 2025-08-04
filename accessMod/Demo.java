package accessMod;

class Launch
{
    public void show()
    {
        Demo obj = new Demo();
        System.out.println(obj.marks);
    }
}

public class Demo {
    // public int marks = 99;
    // private int marks = 99;
    protected int marks = 99;
}
