public class BinaryStringProblem {
    // Binary strings problem (two consecutive ones are not allowed -> 0011, 11, 011, 01011 etc, they are not allowed)...
    public static void printBinaryString(int n, int lastPlace, String str) {
        // base case...
        if (n == 0) {
            System.out.println(str);
            return;
        }

        printBinaryString(n-1, 0, str+"0");

        if (lastPlace == 0) {
            printBinaryString(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        int n = 3;
        printBinaryString(n, 0, "");
    }
}
