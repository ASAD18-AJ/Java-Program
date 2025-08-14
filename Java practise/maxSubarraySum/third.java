import java.util.*;

public class third {
    public static void kadanes(int[] numbers){
       int ms = Integer.MIN_VALUE;
       int cs = 0;

       for(int i=0;i<numbers.length;i++) {
            cs = cs + numbers[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
       }
       System.out.println("our max subarray sum is : " + ms);
    }
    public static void main(String args[]){
        int[] numbers = {-1, 6, 7, 5, 3};
        kadanes(numbers); 
    }
}