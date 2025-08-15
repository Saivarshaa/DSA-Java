import java.util.*;
class ReverseString {
    public static void main(String[] args) {
        //Reverse a string
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a string:");
       char[] s = (sc.nextLine()).toCharArray();
       int i =0,j=s.length-1;
       while(i<j){
           char temp = s[i];
           s[i++]=s[j];
          s[j--] = temp;
       }
       System.out.println(new String(s));
    }
}