import java.util.Scanner;

class SimpleInterest{
    public static void main(String[] args) {
        System.out.println("Find the Simple Interest");
        int P,T,R;
        Scanner in=new Scanner(System.in);
         P=in.nextInt();
         T=in.nextInt();
         R=in.nextInt();
         System.out.println((P*T*R)/100);

    }
}