
public class Increment {

    public static void main(String[] args) {
        PostDecrement(4);

    }

    static void PreDecrement(int n) {
        if (n == 0) {
            return ;
        }
        System.out.println(n);
         PreDecrement(--n);
    }
      static void PostDecrement(int n) {
        if (n == 0) {
            return ;
        }
        System.out.println(n);
         PostDecrement(n--);
    }

}
