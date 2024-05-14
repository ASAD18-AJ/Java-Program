import java.util.Scanner;


public class maxArray {
    public static void main(String[] args) {
        System.out.println("welcome");
        int[] arr = ArrayUtility.inputArray();

        int max= Integer.MIN_VALUE;
        // for(int num: arr){
        //     if(max < num){
        //         max = num;
        //     }
        // }
        for(int num: arr){
            if(max < num ){
                max = num;
            }
        }
        System.out.println("Maximum number is : " + max);
    }
}
