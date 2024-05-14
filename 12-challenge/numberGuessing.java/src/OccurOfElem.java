import java.util.Scanner;
public class OccurOfElem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome");
        int[] nums = ArrayUtility.inputArray();
        System.out.print("Now Enter the number you want to search : ");
        int element = input.nextInt();
        int occ = countOccurences(nums, element);
        System.out.println("Your element was found: " + occ + " times.");
    }
    public static int countOccurences(int[] nums,int element){
        int occ = 0;
        for(int  num : nums ){
            if(num == element)
                occ++;
        }
        return occ;
    }
}

