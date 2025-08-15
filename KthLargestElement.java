import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int i:nums){
        pq.offer(i);
        if(pq.size()>k) pq.poll();
    }
    return pq.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the value of K");
        int k = sc.nextInt();
        System.out.println(findKthLargest(nums, k));
    }
}
