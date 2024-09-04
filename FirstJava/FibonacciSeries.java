import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter a limit");
        Scanner in=new Scanner(System.in);
        int Limit=in.nextInt();
        int a=0,b=1,c;
        System.out.print(a+" "+b);
        for(int i=2;i<Limit;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
        
    }
    
}
