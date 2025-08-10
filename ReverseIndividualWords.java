import java.util.Stack;

public class ReverseIndividualWords {
    public static String reverseIndividualWords(String s){
        Stack<Character> word = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                word.push(s.charAt(i));
            }
            else{
                while(!word.isEmpty()){
                    sb.append(word.pop());
                }
                sb.append(" ");
            }
        }
        while(!word.isEmpty()){
            sb.append(word.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(reverseIndividualWords(s));
    }
}
