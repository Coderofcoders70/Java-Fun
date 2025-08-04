// ********************************** FOR EACH LOOP **************************************
// import java.util.Arrays;
// import java.util.List;
// // import java.util.function.Consumer;

// public class StreamAPIAndForEachJava {
//     public static void main(String[] args) {
        
//         List<Integer> nums = Arrays.asList(4,5,6,9,8,1);

//         // Method to understand forEach 
//         // Consumer<Integer> c = new Consumer<Integer>() {

//         //     public void accept(Integer n) {
                
//         //         System.out.println(n);
//         //     }
//         // };

//         // nums.forEach(c);

//         nums.forEach(n -> System.out.println(n)); // It takes one value at a time.
//     }
// }

// ********************************** STREAM API *****************************************
// import java.util.Arrays;
// import java.util.List;
// import java.util.stream.Stream;
// public class StreamAPIAndForEachJava {
//     public static void main(String[] args) {
        
//         List<Integer> nums = Arrays.asList(4,5,6,9,8,2,1);
        
//         // int sum = 0;       // Try to get the same answer using stream.
//         // for(int n : nums)
//         // {
//         //     if (n%2 == 0) {
//         //         n *= 2;
//         //         sum = sum + n;
//         //     }
//         // }

//         // System.out.println(sum);

//         // Stream<Integer> st1 =  nums.stream();
//         // Stream<Integer> st2 = st1.filter(n -> n%2==0);
//         // Stream<Integer> st3 = st2.map(n -> n*2);
//         // int result = st3.reduce(0, (c,e) -> c+e);

//         // System.out.println(result);

//         // OR

//         // int result = nums.stream()
//         //                  .filter(n -> n%2==0)
//         //                  .map(n -> n*2)
//         //                  .reduce(0, (c,e) -> c+e);

//         // System.out.println(result);

//         // Example for sorting:- 
//         // Stream<Integer> sortedValue = nums.stream()
//         //                  .filter(n -> n%2==0)
//         //                  .sorted();

//         // sortedValue.forEach(n -> System.out.println(n));
//     }
// }