import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // System.out.print("Enter the number of elements: ");
        


        System.out.print("Enter the number of elements: ");
        int size = in.nextInt();
        int[] nums = new int[size];
        int i=0;
        while (i<size) {
            System.out.print("Enter element number " + (i+1) + ": ");
            nums[i] = in.nextInt();
            i++;
        }

        int[] numArray = nums;

        long sum = sum(numArray);
        int avg = average(numArray);
        System.out.println("Sum of the numbers is : "+ sum);
        System.out.println("Average of the numbers is : "+ avg);
    }
    public static long sum(int[] numArray){
        long sum=0;
        int i=0;
        while(i<numArray.length){
            sum +=numArray[i];
            i++;
        }
        return sum;
    }
    public static int average(int[] numArray){
        long sum = sum(numArray);
        return (int) (sum/numArray.length);
    }
    // public static int[] inputArray(){
    //     Scanner in  = new Scanner(System.in);
    //     System.out.print("Enter the number of elements: ");
    //     int size = in.nextInt();
    //     int[] nums = new int[size];
    //     int i=0;
    //     while (i<size) {
    //         System.out.print("Enter element number " + (i+1) + ": ");
    //         nums[i] = in.nextInt();
    //         i++;
    //     }
    //     return nums;
    // }
}
