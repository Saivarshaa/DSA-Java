import java.util.Scanner;

public class ValidPalindrome {
    public static boolean isValidPalindrome(String s){
        if(s==null){
            return true;
        }
        int i =0 , j=s.length()-1;
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;j--;
        }
        return true;
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check");
        String s = sc.nextLine();
        System.out.println(isValidPalindrome(s)?"Valid palindrome":"Not a valid palindrome");
    }
}
