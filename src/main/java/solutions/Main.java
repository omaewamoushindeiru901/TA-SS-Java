package solutions;

import java.util.*;

public class Main {
    public static void main(String [] args){
        Scanner In=new Scanner(System.in);
        int A= In.nextInt();
        int B= In.nextInt();
        int size=B-A+1;
        int[] arr=new int[size];
        System.out.println("Array: ");
        for(int i=0;i<size;i++){
            arr[i]=A;
            A++;
            System.out.print(arr[i]+"\t");
        }
        System.out.println("");

        Solution1 solution1=new Solution1();
        Solution1.sum(arr);
        System.out.println("");

        Solution2 solution2=new Solution2();
        int[] fib_arr= Solution2.do_fibonacci(arr);
        System.out.println("");

     /*   for (int i=0;i<fib_arr.length;i++){
            System.out.print(fib_arr[i]+"\t");
        }*/

        Solution3 solution3= new Solution3();
        Solution3.percentage_in_fib(fib_arr);
    }

}
