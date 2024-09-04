import java.util.Scanner;

public class ArmsStrongNumber  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = in.nextInt();
        int temp = number;
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }

        if (temp == sum) {
            System.out.println(temp + " is an Armstrong number.");
        } else {
            System.out.println(temp + " is not an Armstrong number.");
        }
    }
}
