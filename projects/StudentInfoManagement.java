import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
    int id, age;
    String name, depart;
    
    public Student(int id, String name, String depart, int age)
    {
        this.id = id;
        this.name = name;
        this.depart = depart;
        this.age = age;
    }
}
public class StudentInfoManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Student> students = new ArrayList<Student>();
        System.out.println("Welcome to the Student Management System");
        System.out.println("Enter 1. To add the information of students");
        System.out.println("Enter 2. To view the information of students");
        System.out.println("Enter 3. To update the information of students");
        System.out.println("Enter 4. To delete the information of students");
        System.out.println("Enter 5. To exit");
        
        while (true) {
            System.out.print("\nEnter here: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Fill the Student details:");
                    System.out.print("Enter id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String depart = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    students.add(new Student(id, name, depart, age));        
                    System.out.println("Information added Successfully!!");
                    break;
                case 2:
                    for(Student st : students)
                    {
                        System.out.println("\nId: "+st.id+" Name: "+st.name);
                        System.out.println("Age: "+st.age+" Department: "+st.depart);
                    }
                    break;
                case 3:
                    System.out.print("Enter the Id of Student: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    for (Student st : students) {
                        if (updateId == st.id) {
                            System.out.print("Enter Name: ");
                            st.name = sc.nextLine();

                            System.out.print("Enter Department: ");
                            st.depart = sc.nextLine();

                            System.out.print("Enter Age: ");
                            st.age = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Information updated Successfully!!");
                        }
                    }
                    break;
            
                case 4:
                    System.out.print("Enter the id of student you want to remove: ");
                    int removeId = sc.nextInt();
                    sc.nextLine();

                    boolean found = true;
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).id == removeId) {
                            found = true;
                            students.remove(i);
                            System.out.println("Student removed Successfully!!");
                        }
                    }

                    if (!found) {
                        System.out.println("Please check the entered Id again.");
                    }
                    break;
            
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }
    }
}
