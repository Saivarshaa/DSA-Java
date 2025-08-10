import java.util.HashMap;

public class MaximumOccurringCharacter {
    public static int maximumOccurringCharacter(String s1){
        String s=s1.toLowerCase();
        System.out.println(s);
        HashMap<Character,Integer> hmap = new HashMap<>();
        int res=0;
        for(int i=0;i<s.length();i++){
            hmap.put(s.charAt(i),hmap.getOrDefault(hmap.get(s.charAt(i)), 0)+1);
        }
        for(char ch:hmap.keySet()){
            System.out.println(ch+"-"+hmap.get(ch));
            if(hmap.get(ch)==res){
                return 0;
            }
            if(hmap.get(ch)>res){
                res=hmap.get(ch);
            }
            
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "Abcadr";
        System.out.println(maximumOccurringCharacter(s));
    }
}
