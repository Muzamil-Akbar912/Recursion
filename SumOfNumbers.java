public class SumOfNumbers {
    // Factorial of n...
    public static int sum(int n) {
        // base case...
        if (n == 1) {
            return 1;
        }
        
        int sumNm1 = sum(n-1);
        int sumN = n + sumNm1;
        return sumN;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    }
}
