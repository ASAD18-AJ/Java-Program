import java.util.Scanner;

public class sumPos {
    public static void main(String[] args) {
        System.out.println("welcome to add positive numbers.");
        int[] numArr = ArrayUtility.inputArray();
        int sum=0;
        for(int num: numArr){
            if(num < 0){
                continue;
            }
            sum += num;
        } 
        System.out.println("The sum of positive num is : "+ sum);
    }
}
