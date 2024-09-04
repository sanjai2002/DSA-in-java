
import java.util.Arrays;

public class Leetcode1 {

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 7;
        int[] ans = optimal(nums, target);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }

            }
        }
        return ans;
    }

    public static int[] optimal(int[] nums, int target) {
        int[] ans =new int[2];
     ans[0] = ans[1] = -1;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum =nums[left]+nums[right];
            if(sum==target){
                ans[0]=left;
                ans[1]=right;
                return ans;
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return  ans;
    }
    
}
