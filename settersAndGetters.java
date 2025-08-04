// class Human
// {
//     private int age;
//     private String name;
    
//     public void setAge(int a)
//     {
//         age = a;
//     }

//     public int getAge()
//     {
//         return age;
//     }

//     public void setName(String n)
//     {
//         name = n;     
//     }

//     public String getName()
//     {
//         return name;
//     }

// }

// public class settersAndGetters {
//     public static void main(String[] args) {
//         Human obj = new Human();
//         obj.setAge(21);
//         obj.setName("Rohan");

//         int res = obj.getAge();
//         String name = obj.getName();

//         System.out.println("Age: "+res);
//         System.out.println("Name: "+name);
//     }
// }

// class Human
// {
//     private int age;
//     private String name;
    
//     public void setAge(int age, Human obj) {
//         obj.age = age;
//     }

//     public int getAge() {
//         return age;
//     }

//     public void setName(String name, Human obj) {
//         obj.name = name;
//     }

//     public String getName() {
//         return name;
//     }

// }

// public class settersAndGetters {
//     public static void main(String[] args) {
//         Human obj = new Human();
//         obj.setAge(21, obj);
//         obj.setName("Rohan", obj);

//         int res = obj.getAge();
//         String name = obj.getName();

//         System.out.println("Age: "+res);
//         System.out.println("Name: "+name);
//     }
// }

// ************************** BEST ALTERNATIVE USE "THIS" KEYWORD *****************
/*
   "This" keyword is a reference variable which is used as object instance of a class. It is
   used to access the members of the class.
*/
// class Human
// {
//     private int age;
//     private String name;
    
//     public void setAge(int age) {
//         this.age = age;
//     }

//     public int getAge() {
//         return age;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getName() {
//         return name;
//     }

// }

// public class settersAndGetters {
//     public static void main(String[] args) {
//         Human obj = new Human();
//         obj.setAge(21);
//         obj.setName("Rohan");

//         int res = obj.getAge();
//         String name = obj.getName();

//         System.out.println("Age: "+res);
//         System.out.println("Name: "+name);
//     }
// }