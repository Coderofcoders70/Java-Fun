// *********************************  COMPARATOR *****************************************
/*
    We use comparator if we want to perform operation in sorting to use our own logic.
*/

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;

// class Students
// {
//     int age;
//     String name;

//     public Students(int age, String name)
//     {
//         this.age = age;
//         this.name = name;
//     }

//     // public String toString() {
//     //     return "Students [age=" + age + ", name=" + name + "]\n"; // Without loop
//     // }

//     public String toString() {
//         return "Students [age=" + age + ", name=" + name + "]";
//     }
// }

// public class ComparatorAndComparable {
//     public static void main(String[] args) {

//         // Comparator<Students> c = new Comparator<Students>() {

//         //     public int compare(Students i , Students j)
//         //     {
//         //         if (i.age > j.age) 
//         //         {
//         //             return 1;
//         //         }
//         //         else
//         //         {
//         //             return -1;
//         //         }
//         //     }

//         // };

//         // ********************** OR **********************
        
//         // Comparator<Students> c = new Comparator<Students>() {
            
//         //     public int compare(Students i , Students j)
//         //     {
//         //         return i.age > j.age ? 1 : -1;  // Using Ternary Operator
//         //     }

//         // };

//         // ********************** OR **********************

//         Comparator<Students> c = (i , j) -> i.age > j.age ? 1 : -1;  // Using Lambda Expression
        
//         List<Students> stud = new ArrayList<Students>();
//         stud.add(new Students(22, "Lakshaya"));
//         stud.add(new Students(23, "Ritik"));
//         stud.add(new Students(33, "Ajay"));
//         stud.add(new Students(32, "Jayesh"));
//         stud.add(new Students(31, "Sushil"));

//         Collections.sort(stud, c);
        
//         for(Students st : stud)
//         {
//             System.out.println("Age: "+st.age+" Name: "+st.name);
//         }
//     }

// }

// *********************************  COMPARABLE *****************************************
/*
    We use comparable if we want the class itself to perform sorting and check.
*/

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

// class Students implements Comparable<Students>
// {
//     int age;
//     String name;

//     public Students(int age, String name)
//     {
//         this.age = age;
//         this.name = name;
//     }

//     public int compareTo(Students that) {
        
//         if (this.age > that.age) {
//             return 1;    
//         }
//         else
//         {
//             return -1;
//         }
//     }

// }

// public class ComparatorAndComparable {
//     public static void main(String[] args) {
        
//         List<Students> stud = new ArrayList<Students>();
//         stud.add(new Students(22, "Lakshaya"));
//         stud.add(new Students(23, "Ritik"));
//         stud.add(new Students(33, "Ajay"));
//         stud.add(new Students(32, "Jayesh"));
//         stud.add(new Students(31, "Sushil"));

//         Collections.sort(stud);

//         for(Students st : stud)
//         {
//             System.out.println("Age: "+st.age+" Name: "+st.name);
//         }
//     }
// }
