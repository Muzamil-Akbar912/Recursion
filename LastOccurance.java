public class LastOccurance {
    public static int lastOccur(int arr[], int idx, int key) {
        // base case...
        if (idx == arr.length) {
            return -1;
        }
        int isFound = lastOccur(arr, idx+1, key);

        if (isFound == -1 && arr[idx] == key) {
            return idx;
        }

        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 7, 9, 7};
        System.out.println("The last element occur at index " + lastOccur(arr, 0, 7));
    }
}
