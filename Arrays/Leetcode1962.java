public class Leetcode1962 {
    public static void main(String[] args) {
        int[][] accounts={{1,2,3},{3,2,1}};
        int ans =maximumWealth(accounts);
        System.out.println(ans);
     
    }
     public static int maximumWealth(int[][] accounts) {
        int RichestCustomer=0;
        for(int i=0;i<accounts.length;i++){
            int customerWealth=0;
            for(int j=0;j<accounts[i].length;j++){  
                customerWealth=customerWealth+accounts[i][j];
            }
            if(customerWealth>RichestCustomer){
                RichestCustomer=customerWealth;
            }

            // RichestCustomer=customerWealth>RichestCustomer?customerWealth:RichestCustomer;
           
        }
        return  RichestCustomer;
    }
    
}
