package solutions;

public class Solution1 {
    static void sum(int[] arr){
        int sumOdd=0, sumEven=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) sumEven+=arr[i];
            else sumOdd+=arr[i];
        }
        System.out.println("Sum of odd numbers = "+ sumOdd);
        System.out.println("Sum of even numbers = "+ sumEven);
    }
}
