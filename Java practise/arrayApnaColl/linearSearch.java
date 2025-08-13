import java.util.*;

public class linearSearch {
    public static int linearSearch(int[] nums, int key) {
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==key){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] nums = {12,34,32,56,36,67};
        int key = 34;
        int index = linearSearch(nums, key);
        if(index==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Found");
        }
    }
}