import java.util.Scanner;

class OddEven{
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the Number");
       int Number=in.nextInt();
       if(Number%2==0){
        System.out.println("Even Number");
       }
       else{
        System.out.println("Odd Number");
       }
     
    }
}