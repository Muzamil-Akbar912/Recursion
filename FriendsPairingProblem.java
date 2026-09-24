public class FriendsPairingProblem {
    public static int friendsPairing(int n) {
        // base case..
        if (n == 1 || n == 2) {
            return n;
        }

        // choice for Single...
        int fnm1 = friendsPairing(n-1);
        // Choice for Pairing...
        int fnm2 = friendsPairing(n-2);
        int pair = (n-1) * fnm2;

        return fnm1 + pair;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(friendsPairing(n));
    }
}
