import java.util.Scanner;

public class NextGreaterNumber {
    public static void reverse(int[] nums,int start , int end){
        int i=start,j=end;
        while(i<j){
            int temp = nums[i];
            nums[i++]=nums[j];
            nums[j--]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
         int ind = -1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind = i;
                break;
            }
        }
        if(ind==-1){
             reverse(nums,0,n-1);
             return;
        }else{
        for(int i=n-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                int temp = nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }
        }
        reverse(nums,ind+1,n-1);
    }
    for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
