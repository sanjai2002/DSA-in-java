
public class Leetcode1925 {

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int ans = findNumbers(nums);
        System.out.println(ans);

            
    }

    public static int findNumbers(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(Digits(nums[i])%2==0){
               ans+=1;
            }

        }

        return  ans;
    }

    public static int Digits(int num){
        int count=0;
        while(num>0){
        num/=10;  
        count++ ;
        }
        return  count;
    }

   
    

}
