import java.net.SocketPermission;
import java.util.*;

public class ContainsDuplicate{
    public static boolean containsDuplicate(int[] nums){
    Set<Integer> seen = new HashSet<>();
    for(int i:nums){
        if(!seen.add(i)) return true;
    }
    return false;
}

    public static void main(String args[]){
        int[] nums = {1,2,3,1};
        boolean result = containsDuplicate(nums);
        System.out.println("Contains Duplicate? "+result);
    }
}
