public class XpowN {
    // Approach 01 O(n)...
    public static int pow(int x, int n) {
        // Base case...
        if (n == 0) {
            return 1;
        }
        int xnm1 = pow(x, n-1);
        int xn = x * xnm1;
        return xn;
    }

    // Approach 02 optimized approach O(logn)...
    public static int pow2(int x, int n) {
        // base case..
        if (n == 0) {
            return 1;
        }
        
        int halfPow = pow2(x, n/2);
        int halfPowSq = halfPow * halfPow;

        // n == odd...
        if (n % 2 != 0) {
            halfPowSq = x * halfPowSq;
        }
        // n == even...
        return halfPowSq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(pow(x, n));
        System.out.println(pow2(x, n));
    }
}
