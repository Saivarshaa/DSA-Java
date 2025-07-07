import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> res = new ArrayList<>();
        HashMap<String,List<String>> hmap = new HashMap<>();
        for(String str:strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted=new String(chars);
            hmap.putIfAbsent(sorted,new ArrayList<>());
            hmap.get(sorted).add(str);
        }
        for(String s:hmap.keySet()){
            res.add(hmap.get(s));
        }
        return res;
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println("The group of anagrams are - "+ groupAnagrams(strs));
    }
}
