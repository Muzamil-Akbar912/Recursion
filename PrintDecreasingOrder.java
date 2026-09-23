public class PrintDecreasingOrder {
    // Print decreasing order...
    public static void printDec(int n) {
        // base case...
        if (n == 1) {
            System.out.print(1);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
}
