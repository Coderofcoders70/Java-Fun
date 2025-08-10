//********************************** COLLECTION ***************************************
/*
    We use <E> in collecion Api because they store the classes of different data types. So,
    that we can add the correct value. And if there is any exception then it will warn with 
    a compile time error.
*/
// import java.util.ArrayList;
// import java.util.Collection;

// public class CollectionsAPIJava {
//     public static void main(String[] args) {
        
//         Collection<Integer> nums = new ArrayList<Integer>();    
//         nums.add(6);
//         nums.add(3);
//         nums.add(7);
//         nums.add(1);
//         nums.add(2);

//         for(Object n : nums)
//         {
//             System.out.println(n);
//         }
//     }
// }

// ******************************** LIST USING ARRAYLIST **********************************
// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.List;

// public class CollectionsAPIJava {
//     public static void main(String[] args) {
        
//         List<Integer> nums = new ArrayList<Integer>();    
//         nums.add(6);
//         nums.add(3);
//         nums.add(7);
//         nums.add(1);
//         nums.add(2);

//         // System.out.println("Index Value: "+nums.get(3));

//         Iterator<Integer> values = nums.iterator();

//         while (values.hasNext()) {
//             System.out.println(values.next());
//         }

//         // for(Object n : nums)
//         // {
//         //     System.out.println(n);
//         // }
//     }
// }

// ******************************** SET USING HASHSET **********************************
/*
    Hashset can sort smaller elements but it is not preferred to use this for sorting.
*/
// import java.util.HashSet;
// import java.util.Iterator;
// import java.util.Set;

// public class CollectionsAPIJava {
//     public static void main(String[] args) {
        
//         Set<Integer> nums = new HashSet<Integer>();    
//         nums.add(6);
//         nums.add(3);
//         nums.add(7);
//         nums.add(1);
//         nums.add(2);

//         // System.out.println("Index Value: "+nums.get(3));

//         Iterator<Integer> values = nums.iterator();

//         while (values.hasNext()) {
//             System.out.println(values.next());
//         }

//         // for(Object n : nums)
//         // {
//         //     System.out.println(n);
//         // }
//     }
// }

// ******************************** SET USING TREESET **********************************
/*
    TreeSet helps to sort the values.
*/
// import java.util.Iterator;
// import java.util.Set;
// import java.util.TreeSet;

// public class CollectionsAPIJava {
//     public static void main(String[] args) {
        
//         Set<Integer> nums = new TreeSet<Integer>();    
//         nums.add(62);
//         nums.add(35);
//         nums.add(71);
//         nums.add(12);
//         nums.add(23);

//         // System.out.println("Index Value: "+nums.get(3));

//         Iterator<Integer> values = nums.iterator();

//         while (values.hasNext()) {
//             System.out.println(values.next());
//         }

//         // for(Object n : nums)
//         // {
//         //     System.out.println(n);
//         // }
//     }
// }

// ******************************** COLLECTION USING TREESET ******************************
/*
    TreeSet helps to sort the values.
*/
// import java.util.Collection;
// import java.util.Iterator;
// import java.util.TreeSet;

// public class CollectionsAPIJava {
//     public static void main(String[] args) {
        
//         Collection<Integer> nums = new TreeSet<Integer>();    
//         nums.add(62);
//         nums.add(35);
//         nums.add(71);
//         nums.add(12);
//         nums.add(23);

//         // System.out.println("Index Value: "+nums.get(3));

//         Iterator<Integer> values = nums.iterator();

//         while (values.hasNext()) {
//             System.out.println(values.next());
//         }

//         // for(Object n : nums)
//         // {
//         //     System.out.println(n);
//         // }
//     }
// }

// ********************************** MAP USING HASHMAP **********************************
/*
    HashMap is used if there is no need to use multiple data at the same time.
*/
// import java.util.HashMap;
// import java.util.Map;

// public class CollectionsAPIJava {
//     public static void main(String[] args) {
        
//         Map<String, Integer> students = new HashMap<>(); 
//         students.put("Lakshaya", 99);   
//         students.put("Ritik", 100);   
//         students.put("Dungra Ram Choudhary", 100);   
//         students.put("Abhijeet", 94);   
//         students.put("Sushil", 93);  
        
//         // System.out.println(students.get("Lakshaya"));
//         // System.out.println(students.keySet());

//         for(String key : students.keySet())
//         {
//             System.out.println(key + " : "+students.get(key));
//         }
//     }
// }

// ********************************** MAP USING HASHTABLE **********************************
/*
    HashTable is used if there is need to use multiple data at the same time. And if we need
    to print the data in a synchronized way.
*/
// import java.util.Hashtable;
// import java.util.Map;

// public class CollectionsAPIJava {
//     public static void main(String[] args) {
        
//         Map<String, Integer> students = new Hashtable<>(); 
//         students.put("Lakshaya", 99);   
//         students.put("Ritik", 100);   
//         students.put("Dungra Ram Choudhary", 100);   
//         students.put("Abhijeet", 94);   
//         students.put("Sushil", 93);  
        
//         // System.out.println(students.get("Lakshaya"));
//         // System.out.println(students.keySet());

//         for(String key : students.keySet())
//         {
//             System.out.println(key + " : "+students.get(key));
//         }
//     }
// }

// ********************************** SORTING USING LIST **********************************
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

// public class CollectionsAPIJava {
//     public static void main(String[] args) {
        
//         List<Integer> nums = new ArrayList<Integer>(); 
//         nums.add(9);   
//         nums.add(10);   
//         nums.add(0);   
//         nums.add(4);   
//         nums.add(3);  

//         Collections.sort(nums);
//         System.out.println(nums);
//     }
// }

// *************************** SORTING USING LIST WITH COMPARATOR ************************
// Sorting the second digit.

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;

// public class CollectionsAPIJava {
//     public static void main(String[] args) {
        
//         Comparator<Integer> c = new Comparator<Integer>() {
            
//             public int compare(Integer i, Integer j)
//             {
//                 if (i%10 > j%10) {
//                     return 1;
//                 }
//                 else
//                 {
//                     return -1;
//                 }
//             }
//         };
        
//         List<Integer> nums = new ArrayList<Integer>(); 
//         nums.add(91);   
//         nums.add(10);   
//         nums.add(34);   
//         nums.add(47);   
//         nums.add(39);  

//         Collections.sort(nums, c);
//         System.out.println(nums);
//     }
// }
// ************** SORTING THE LENGTH OF THE STRING USING LIST WITH COMPARATOR *************

// Sorting the list according to the length of the string

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;

// public class CollectionsAPIJava {
//     public static void main(String[] args) {
        
//         Comparator<String> c = new Comparator<String>() {
            
//             public int compare(String i, String j)
//             {
//                 if (i.length() > j.length()) {
//                     return 1;
//                 }
//                 else
//                 {
//                     return -1;
//                 }
//             }
//         };
        
//         List<String> name = new ArrayList<String>(); 
//         name.add("Lakshaya");   
//         name.add("Ritik");   
//         name.add("Nandini");   
//         name.add("Ajay");   
//         name.add("Jayesh");  

//         Collections.sort(name, c);
//         System.out.println(name);
//     }
// }