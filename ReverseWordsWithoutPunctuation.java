import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseWordsWithoutPunctuation {
    public static String reverseWords(String s){
        List<String> words = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
            else{
                if(sb.length()>0){
                    words.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        if(sb.length()>0) {
            words.add(sb.toString());
            sb.setLength(0);
        }
        Collections.reverse(words);
        int j =0;
        for(int i=0;i<s.length();){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(words.get(j++));
                while(i<s.length() && Character.isLetterOrDigit(s.charAt(i))){
                    i++;
                }
            }
            else{
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        System.out.println(reverseWords(s)); 
    }
}
