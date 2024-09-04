
public class Reverse {

    public static void main(String[] args) {
        Method1(1234);
        System.out.println(sum);

    }

    static int sum = 0;

    static void Method1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        Method1(n / 10);

    }

}
