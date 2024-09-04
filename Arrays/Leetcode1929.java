import java.util.Arrays;

public class Leetcode1929 {
    public static void main(String[] args) {
        int[] nums ={4,5,6,8};
        int[] ans=getConcatenation(nums);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] getConcatenation(int[] nums) {
        int ans[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
            
        }
        return  ans ;

        
    }
    
}
