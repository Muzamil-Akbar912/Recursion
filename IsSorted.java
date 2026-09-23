public class IsSorted {
    public static boolean isSorted(int arr[], int idx) {
        // base case...
        if (idx == arr.length-1) {
            return true;
        }

        if (arr[idx] > arr[idx+1]) {
            return false;
        }

        return isSorted(arr, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        System.out.println(isSorted(arr, 0));
    }
}
