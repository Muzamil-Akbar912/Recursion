public class FirstOccurance {
    public static int firstOcc(int arr[], int idx, int key) {
        // base case...
        if (idx == arr.length) {
            return -1;
        }

        if (arr[idx] == key) {
            return idx;
        }

        return firstOcc(arr, idx+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 7, 9, 7};
        System.out.println("The first element occur at index " + firstOcc(arr, 0, 7));
    }
}
