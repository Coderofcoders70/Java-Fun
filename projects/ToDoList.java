import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lis = new ArrayList<String>();

        System.out.println("Welcome to our To-Do-List App");
        System.out.println("Enter 0 -> To Exit");
        System.out.println("Enter 1 -> To add list");
        System.out.println("Enter 2 -> To View list");
        System.out.println("Enter 3 -> To Update list");
        System.out.println("Enter 4 -> To Delete list");
        
        while (true) {
            System.out.print("\nEnter here: ");
            int num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                case 1:
                    System.out.println("Enter task: ");
                    lis.add(sc.nextLine());
                    System.out.println("Task added Successfully");
                    break;

                case 2:
                    System.out.println("Tasks:");
                    for(int i = 0; i < lis.size(); i++)
                    {
                        System.out.println((i+1)+". "+lis.get(i));
                    }
                    break;

                case 3:
                    System.out.print("Enter the task number which you want to update: ");
                    int val = sc.nextInt() - 1;
                    sc.nextLine();
                    System.out.print("Enter the task: ");
                    String task = sc.nextLine();
                    System.out.println(lis.set(val, task));
                    System.out.println("Task updated Successfully");
                    break;

                case 4:
                    System.out.print("Enter the task number which you want to delete: ");
                    int taskNum = sc.nextInt();
                    if (taskNum > 0 && taskNum <= lis.size())
                    {
                        lis.remove(taskNum - 1);
                        System.out.println("Task Deleted Successfully");
                    }
                    else
                    {
                        System.out.println("Invalid value. Please check again");
                    }
                    break;
            
                default:
                    System.out.println("Choose the correct option");
                    break;
            }
        }
    }
}
