import java.util.Scanner;

public class DeleteFromArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numArr = inputArray();
        System.out.print("Enter the number you want to delete: ");
        int numToDelete = in.nextInt();
        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.println("Here is new array");
        displayArray(newArr);
    }

    public static int[] deleteNumber(int[] numArr, int numToDelete) {
        int occ = noOfOccurrences(numArr, numToDelete);
        if (occ == 0) {
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr =  new int[newSize];
        int i = 0, j = 0;
        while (i < numArr.length) {
            if (numArr[i] != numToDelete) {
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }

    public  static int noOfOccurrences(int[] numArr,int num){
        int occ=0;
        int i=0;
        while(i<numArr.length){
            if(numArr[i] == num){
                occ++;
            }
            i++;
        }
        return occ;
    }

    public static void displayArray(int[] numArray) {
        int i = 0;
        while (i < numArray.length) {
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println();
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
