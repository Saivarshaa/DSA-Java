import java.util.Scanner;

public class MaximumSubarraySum {
    public static int maximumSubarraySum(int[] nums){
        //Kandane's Algorithm
        if(nums.length==1){
            return nums[0];
        }
        int max=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<nums.length;i++){
            sum = Math.max(nums[i],sum+nums[i]);
            max=(sum>max)?sum:max;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("The maximum subarray sum is "+maximumSubarraySum(nums));
    }
}
