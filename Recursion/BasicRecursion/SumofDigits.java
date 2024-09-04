
public class SumofDigits {

    public static void main(String[] args) {
        int sum = DigitsSum(1234);
       int product= DigitsProduct(1234);
        System.out.println(sum);
        System.out.println(product);

    }

    static int DigitsSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + DigitsSum(n / 10);

    }
    static  int DigitsProduct(int n){
         if (n == 1) {
            return 1;
        }
        return n % 10 * DigitsProduct(n / 10);
    }

}
