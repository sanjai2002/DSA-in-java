
public class Factorial {

    public static void main(String[] args) {
        int ans = RecursionFact(5);
        System.out.println(ans);
    }

    static int Fact(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

    static int RecursionFact(int n) {
        if (n == 1) {
            return 1;
        }
        return n* RecursionFact(n - 1);

    }

}
