import java.util.*;

public class anagram{
    public static boolean isAnagrams(String str1, String str2) {
        char[] s=str1.toCharArray();
        char[] s2=str2.toCharArray();
        if(str1.length()!=str2.length()){
            return false;
        }
        else{
            int count=0;
            for(char i:s){
                for(char j:s2){
                    if(j==i){
                        count=count+1;
                    }
                }
            }
            if(count==str1.length()){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();

        if (isAnagrams(str1, str2)) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are not Anagram");
        }
    }
}
