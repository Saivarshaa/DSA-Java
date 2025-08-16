import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class SecondLargestInArray {
    public static int secondLargest(int[] arr){
        int large = -1,secLarge =-1;
        for(int i:arr){
            if(i>large){
                secLarge=large;
                large= i;
            }
            else if(i<large && i>secLarge){
                secLarge=i;
            }
        }
        return secLarge;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res = secondLargest(arr);
        if(res!=-1){
            System.out.println("The second largest element in the array is "+ res );
        }
        else{
            System.out.println("There is no second largest element in the array");
        }
    }
}
