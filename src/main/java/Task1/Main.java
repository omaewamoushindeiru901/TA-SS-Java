package Task1;

import java.util.*;

public class Main {
    public static void main(String [] args){
        Scanner Input=new Scanner(System.in);
        int A= Input.nextInt();
        int B= Input.nextInt();
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
        int[] fib_arr= Solution2.doFibonacci(arr);
        System.out.println("");

        Solution3 solution3= new Solution3();
        Solution3.percentageInFib(fib_arr);
    }

}
