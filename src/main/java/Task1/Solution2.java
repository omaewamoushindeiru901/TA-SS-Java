package Task1;

import java.util.Scanner;

public class Solution2 {
    static int[] fibonacci(int f0,int f1,int n){
        int[] fib_arr=new int[n];
        int f2;
        System.out.print(f0+"\t"+f1+"\t");
        fib_arr[0]=f0; fib_arr[1]=f1;
        for(int i=3;i<=n;i++){
            f2=f0+f1;
            fib_arr[i-1]=f2;
            System.out.print(f2+"\t");
            f0=f1;
            f1=f2;
        }
        return fib_arr;
    }
    static int[] doFibonacci(int[]arr){
        Scanner Input=new Scanner(System.in);
        System.out.println("Enter the size of set: ");
        int n=Input.nextInt();

        int even=1,odd=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]%2==0) {
                if(even==1) {
                    even=arr[i];
                }
                if(even<arr[i]) {
                    even=arr[i];
                }
            }
            else {
                if(arr[i]%2!=0) {
                    if(odd==0) {
                        odd=arr[i];
                    }

                    if(odd<arr[i]) {
                        odd=arr[i];
                    }
                }
            }

        }
       return fibonacci(even,odd,n);
    }
}
