public class Sum {
    public static void main(String[] args) {
        int ans =SumofNumbers(5);
        System.out.println(ans);
        
    }
    
    static int SumofNumbers(int n){
        if(n==1){
            return 1;
        }
        return n+SumofNumbers(n-1);

    }
}
