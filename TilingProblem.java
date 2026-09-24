public class TilingProblem {
    // Tiling problem...
    public static int tilingProblem(int n) {
        // base case...
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical...
        int fnm1 = tilingProblem(n-1);
        // Horizontal
        int fnm2 = tilingProblem(n-2);

        int totalWays = fnm1 + fnm2;

        return totalWays;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("The total no. of ways to place tile into the floor = " + tilingProblem(n));
    }
}
