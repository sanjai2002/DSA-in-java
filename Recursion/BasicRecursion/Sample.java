
class Sample {

    public static void main(String[] args) {
        // Number(5);
        NumberReverse(5);
    }

    static void Number(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        Number(n - 1);
    }

    static void NumberReverse(int n) {
        if (n == 0) {
            return;
        }
        NumberReverse(n - 1);
        System.out.println(n);

    }

}
