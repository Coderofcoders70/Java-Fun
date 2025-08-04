//***************************** STATIC VARIABLE *************************
// class Mobile
// {
//     int srNo;
//     static String categ;
//     String modName;
//     String CompName;

//     public void show()
//     {
//         System.out.println(srNo+" "+CompName+": "+modName+" Category: "+categ);
//     }
// }

// public class staticVariableAndClass {
//     public static void main(String[] args) {
//         Mobile mob1 = new Mobile();
//         mob1.srNo = 1;
//         mob1.modName = "IPhone X";
//         mob1.CompName = "Apple";
//         Mobile.categ = "Smart phone";

//         Mobile mob2 = new Mobile();
//         mob2.srNo = 2;
//         mob2.modName = "Samsung J7";
//         mob2.CompName = "Samsung";
//         Mobile.categ = "Smart phone";

//         // Mobile.categ = "Mobile phone";

//         mob1.show();
//         mob2.show();
//     }
// }

// class Mobile
// {
//     int srNo;
//     static String categ;
//     String modName;
//     String CompName;
// }

// public class staticVariableAndClass {
//     public static void main(String[] args) {
//         Mobile mob1 = new Mobile();
//         mob1.srNo = 1;
//         mob1.modName = "IPhone X";
//         mob1.CompName = "Apple";
//         Mobile.categ = "Smart phone";

//         Mobile mob2 = new Mobile();
//         mob2.srNo = 2;
//         mob2.modName = "Samsung J7";
//         mob2.CompName = "Samsung";
//         Mobile.categ = "Smart phone";

//         Mobile mobile[] = new Mobile[2];
//         mobile[0] = mob1;
//         mobile[1] = mob2;

//         for(Mobile mob : mobile)
//         {
//             System.out.println(mob.srNo+" "+mob.CompName+": "+mob.modName+" Category: "+Mobile.categ);
//         }
//     }
// }

//***************************** STATIC METHOD - 1 *************************
// class Mobile
// {
//     static
//     {
//         String name = "Hey I am a static method";
//         System.out.println(name);
//     }
// }

// public class staticVariableAndMethod {
//     public static void main(String[] args) throws ClassNotFoundException {
//         Class.forName("Mobile");
//     }
// }

//***************************** STATIC METHOD - 2 *************************
// class Mobile
// {
//     int srNo;
//     static String categ;
//     String modName;
//     String CompName;

//     public void show()
//     {
//         System.out.println(srNo+" "+CompName+" : "+modName+" Category: "+categ);
//     }

//     public static void show1(Mobile mob)
//     {
//         System.out.println(mob.srNo+" "+mob.CompName+" : "+mob.modName+" Category: "+categ);
//     }
// }

// public class staticVariableAndMethod {
//     public static void main(String[] args) {
//         Mobile mob1 = new Mobile();
//         mob1.srNo = 1;
//         mob1.modName = "IPhone X";
//         mob1.CompName = "Apple";
//         Mobile.categ = "Smart phone";

//         Mobile mob2 = new Mobile();
//         mob2.srNo = 2;
//         mob2.modName = "Samsung J7";
//         mob2.CompName = "Samsung";
//         Mobile.categ = "Smart phone";

//         mob1.show();
//         mob2.show();

//         Mobile.show1(mob1);
//     }
// }