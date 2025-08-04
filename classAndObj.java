import java.util.Scanner;
// class calculator
// {
//     int res;

//     public int calculate(int n1, int n2)
//     {
//         res = n1 + n2;
//         return res;
//     }
// }

// public class classAndObj {
//     public static void main(String[] args) {

//         int num1 = 4;
//         int num2 = 5;

//         calculator calc = new calculator();

//         int result = calc.calculate(num1, num2);

//         System.out.println(result);
//     }
// }

// class calculator
// {
//     int res;

//     public void calculate(int n1, int n2)
//     {
//         res = n1 + n2;
//         System.out.println(res);
//         res = n1 - n2;
//         System.out.println(res);
//         res = n1 * n2;
//         System.out.println(res);
//         res = n1 / n2;
//         System.out.println(res);
//         res = n1 % n2;
//         System.out.println(res);
//     }
// }

// public class classAndObj {
//     public static void main(String[] args) {

//         int num1 = 4;
//         int num2 = 5;

//         calculator calc = new calculator();

//         calc.calculate(num1, num2);

//         // System.out.println(result);
//     }
// }

// ************************** METHOD OVERLOADING *************************
// class calculator
// {
//     public int add(int n1, int n2)
//     {
//         return n1 + n2;
//     }

//     public int add(int n1, int n2, int n3)
//     {
//         return n1 + n2 + n3;
//     }

//     public double add(double n1, int n2)
//     {
//         return n1 + n2;
//     }
// }

// public class classAndObj {
//     public static void main(String[] args) {

//         int num1 = 4;
//         int num2 = 5;

//         calculator calc = new calculator();

//         int result = calc.add(num1, num2);

//         System.out.println(result);
//     }
// }

// class computer
// {
//     public void playMusic()
//     {
//         System.out.println("Music is playing....");
//     }

//     public void playGames()
//     {
//         System.out.println("Let's play video games....");
//     }
// }

// public class classAndObj {
//     public static void main(String[] args) {

//         computer comp = new computer();
//         comp.playMusic();
//         comp.playGames();
//     }
// }

class computer
{
    public void playMusic()
    {
        System.out.println("Music is playing....");
    }

    public void playGames()
    {
        System.out.println("Let's play video games....");
    }
}

public class classAndObj {

    public static void main(String[] args) {
        
        char ch;
        Scanner scann = new Scanner(System.in);
        computer comp = new computer();

        System.out.println("Do you want to listen music?");
        System.out.println("Press y --> Yes");
        System.out.println("Press n --> No");
        ch = scann.next().charAt(0);
        if (ch == 'y' || ch == 'Y') {
            comp.playMusic();
        }
        else
        {
            System.out.println("C'mon don't you listen music..!!");
        }

        System.out.println("Do you want to play video games?");
        System.out.println("Press y --> Yes");
        System.out.println("Press n --> No");
        ch = scann.next().charAt(0);
        if (ch == 'y' || ch == 'Y') {
            comp.playGames();
        }
        else
        {
            System.out.println("C'mon don't you play games..!!");
        }

        scann.close();
    }
}
