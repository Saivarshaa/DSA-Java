import java.util.*;
public class CountDistinctYears {
    public static int countDistinctYears(String s){
        Set<Integer> years = new HashSet<>();
        String s1= "";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                s1+=s.charAt(i);
            }
            if(s.charAt(i)=='-'){
                s1="";
            }
            if(s1.length()==4){
                years.add(Integer.parseInt(s1));
                s1="";
            }
        }
        return years.size();
    }

    public static void main(String[] args) {
        String s="UN was established on 24-10-1945. India got freedom on 15-08-1947.";
        System.out.println(countDistinctYears(s));
    }
}
