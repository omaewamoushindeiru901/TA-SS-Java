package solutions;

public class Solution3 {
    static void percentage_in_fib(int[]arr){
        int counter_odd=0, counter_even=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) counter_even++;
            else if(arr[i]%2!=0) counter_odd++;
        }
        float per_odd=(100*counter_odd)/arr.length;
        float per_even=(100*counter_even)/arr.length;
        System.out.println("Percentage of odd numbers: "+per_odd+"%");
        System.out.println("Percentage of even numbers: "+per_even+"%");
    }
}
