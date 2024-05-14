import  java.util.Scanner;


public class isSorted {
    public static void main(String[] args){
        int[] numArr = inputArray();
        boolean isInc = isIncreasing(numArr);
        boolean isDec = isDecreasing(numArr);
        if(isInc || isDec){
            System.out.println("Your array is sorted");
        }else{
            System.out.println("Your array is not sorted");
        }
    }
    public static boolean isDecreasing(int[] numArr){
        int i=1;
        while(i<numArr.length){
            if(numArr[i]>numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isIncreasing(int[] numArr){
        int i = 1;
        while (i<numArr.length) {
            if (numArr[i]<numArr[i-1]) {
                return false;
            }
            i++;
        }
        return true;
             
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
