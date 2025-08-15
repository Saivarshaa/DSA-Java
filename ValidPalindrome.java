import java.util.Scanner;

public class ValidPalindrome {
      public static void main(String[] args) {
        //valid Palindrome
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check");
        String s = sc.nextLine();
        int i=0,j=s.length()-1;
        while (i<j){
            if(s.charAt(i++)!=s.charAt(j--)){
                System.out.println(s+" is not a palindrome");
                return ;
                
            }
        }
        System.out.println(s+" is a Palindrome");
    }
}
