import java.util.Scanner;

public class ZohoPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i-1;j++){
                System.out.print("  ");
            }
            int num = i;
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            num-=2;
            for(int j=1;j<i;j++){
                System.out.print(num+" ");
                num--;
            }
            
            System.out.println();
         } 


    }
}
