
import java.util.Arrays;

public class Leetcode1480 {
    public static void main(String[] args) {
        int[] nums={1,1,1,1,1};
        int[] ans=runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }
   
    public static int[] runningSum(int[] nums){
        int ans[]=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            ans[i]=sum;
        }
        return ans ;
    }
   
    
    
}
