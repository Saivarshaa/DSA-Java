public class RemoveDuplicatesFromString {
    public static String removeDuplicates(String s){
        int[] chars = new int[256];
        StringBuilder sb = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(chars[ch]==0){
                sb.append(ch);
            }
            chars[ch]++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "CsharpstarZ";
        System.out.println(removeDuplicates(s));

    }
}
