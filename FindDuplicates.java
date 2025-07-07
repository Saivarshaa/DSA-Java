import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] nums){
        //Index Marking Technique
        List<Integer> res = new ArrayList<>();
        for(int i:nums){
            int num = Math.abs(i);
            int index=num-1;
            if(nums[index]<0) res.add(num);
            else {
                nums[index]=-nums[index];
            }
        }
        return res;
    }

    public static void main(String args[]){
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println("The Duplicates are - "+findDuplicates(nums));
    }
}
