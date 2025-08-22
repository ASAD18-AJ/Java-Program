import java.util.*;

public class subString {
    public static String substring(String str, int si,int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]) {
        String str = "Hello, I am learning Java";
        String substr = substring(str, 0, 5);
        System.out.println(substr);
    }
}