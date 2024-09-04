
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println("Enter a Two number");
        Scanner in=new Scanner(System.in);
        int Num1=in.nextInt();
        int Num2=in.nextInt();
        int Max=0;
        if(Num1>Max){
            Max=Num1;
        }
        if(Num2>Max){
            Max=Num2;
        }
        System.out.println(Max);

        
    }
    
}
