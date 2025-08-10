//the given array is sorted 
public class EliminateDuplicates {
    public static int eliminateDuplicates(int[] arr){
        int idx=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[idx++]=arr[i];
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3};
        System.out.println(eliminateDuplicates(arr));
    }
}
