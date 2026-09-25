public class AllOccurance {
    // All occurance...
    public static void printAllOccur(int arr[], int key, int idx) {
        // Base case..
        if (idx == arr.length) {
            return;
        }

        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }
        printAllOccur(arr, key, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // printAllOccur(arr, 2);
        printAllOccur(arr, 2, 0);
    }
}