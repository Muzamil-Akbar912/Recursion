public class ConvertNumToString {
    public static void convertNumToString(int n, String str[], StringBuilder sb) {
        // Base case...
        if (n == 0) {
            return;
        }
        int digit = n % 10;

        convertNumToString(n/10, str, sb);

        sb.append(str[digit]).append(" ");
    }

    public static void main(String[] args) {
        // int n = 2019;
        int n = 6789;
        String str[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        if (n == 0) {
            System.out.println("Zero");
        } else {
            StringBuilder result = new StringBuilder();
            convertNumToString(n, str, result);

            // remove last space 
            System.out.println(result.toString().trim());
        }
    }
}
