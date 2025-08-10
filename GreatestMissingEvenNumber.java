/*Problem Statement
Given an array of sorted even integers (ascending order) without duplicates, find the largest even number that is missing between the minimum and maximum of the array.
Return the greatest missing even number, or -1 if no even number is missing.

Example :
Input: [2, 4, 6, 10]
Range is 2 to 10 → Even numbers are 2, 4, 6, 8, 10
Missing: 8
Output: 8

Constraints:
Sorted ascending
Length: 1 <= n <= 10^5
Value range: 0 <= arr[i] <= 10^9*/


public class GreatestMissingEvenNumber {
    public static int greatestMissingEvenNumber(int[] arr){
        int missingNum=-1;
        for(int i=1;i<arr.length;i++){
           int j=(arr[i]%2==0)?arr[i]-2:arr[i]-1;
            for(;j>arr[i-1];j-=2){
                missingNum=Math.max(missingNum, j);
            }
        }
        return missingNum;
    }

    public static void main(String[] args) {
        int[] arr = {4,8,15};
        System.out.println(greatestMissingEvenNumber(arr));
    }
}
