import java.util.*;

public class LongestVowelSubsequence {

    public static boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();
        int m=x.length();
        int n = y.length();
          int[][] dp=new int[m+1][n+1]; // all cells initialized to zero
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(isVowel(x.charAt(i-1))&&x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[m][n]);
    }
}
