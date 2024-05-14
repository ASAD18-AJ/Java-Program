import java.util.Scanner;

public class OccurrenceArray {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] numArr = inputArray();
        System.out.print("Now enter the numbwer you want to find: ");
        int num = in.nextInt();
        int occurrences = noOfOccurrences(numArr,num);
        System.out.println("Your element was found " + occurrences +"times in");
    }

    public static int noOfOccurrences(int[] numArr, int num){
        int occ =0;
        int i=0;
        while(i<numArr.length){
            if(numArr[i] == num){
                occ++;
            }
            i++;
        }
        return occ;
    }


    public static int[] inputArray(){
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = in.nextInt();
        int[] nums = new int[size];
        int i=0;
        while (i<size) {
            System.out.print("Enter element number " + (i+1) + ": ");
            nums[i] = in.nextInt();
            i++;
        }
        return nums;
    }
}
