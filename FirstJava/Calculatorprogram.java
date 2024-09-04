
import java.util.Scanner;

public class Calculatorprogram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
             System.out.println(" Enter the choice : + - * / %");
        char choice = in.next().trim().charAt(0);
        while (true) {
   
        System.out.println("Enter a two number");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int Ans = 0;
        if (choice == '+') {
            Ans = num1 + num2;

        }
        if (choice == '-') {
            Ans = num1 - num2;
        }
        if (choice == '*') {
            Ans = num1 * num2;
        }
        if (choice == '/') {
            Ans = num1 / num2;
        }
        if (choice == '%') {
            Ans = num1 % num2;
        }
        else if(choice=='X'||choice=='x'){
            break;
        }
        else{
            System.out.println("Invalid Choice");
        }


        System.out.println(Ans);

        }
        

    }

}
