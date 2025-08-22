import java.util.*;

public class largestString {
    public static void main(String args[]){
        String fruits[] = {"Apple", "Banana", "Cherry", "Date"};

        String largest = fruits[0];
        
        for(int i=1;i<fruits.length;i++) {
            System.out.println(largest);
            System.out.println(fruits[i]);
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println("largest: " + largest);
    }
}