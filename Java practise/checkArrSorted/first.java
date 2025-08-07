class first {
    static boolean isSorted(int arr[],int n) {
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(arr[i]>arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5}, n =5;
        System.out.println(isSorted(arr, n));
    }
}

//time complexity: O(n^2)
//space complexity: O(1)