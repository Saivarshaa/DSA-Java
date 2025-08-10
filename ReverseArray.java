public class ReverseArray {
    public static void reverseArray(int[] arr){
        int i=0,n=arr.length,j=n-1;
        while(i<=n/2){
            int temp=arr[i];
            arr[i++]=arr[j];
            arr[j--]=temp;
        }
        for(int k: arr){
            System.out.print(k+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        reverseArray(arr);
    }
    
}
