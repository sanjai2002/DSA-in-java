
import java.util.Arrays;

public class Leetcode1470 {
    public static void main(String[] args) {
       int[] nums={2,5,1,3,4,7};
       int n=3;
        int[] ans=shuffle(nums,n);
        System.out.println(Arrays.toString(ans));
    }

    public static  int[] shuffle(int[] nums, int n) {
        int[] ans=new int[nums.length];
        for(int i=0;i<n;i++){
            ans[i*2]=nums[i];
            ans[i*2+1]=nums[i+n];
        }
        return ans;
    }

    
}
