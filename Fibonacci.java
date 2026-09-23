public class Fibonacci {
    public static int fab(int n) {
        // base case...
        if (n == 0 || n == 1) {
            return n;
        }

        int fabNm1 = fab(n-1);
        int fabNm2 = fab(n-2);
        int fabN = fabNm1 + fabNm2;

        return fabN;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fab(n));
    }
}
