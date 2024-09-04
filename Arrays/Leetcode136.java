
public class Leetcode136 {

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        // System.out.println(Optimal(nums));
        System.out.println(6^2);
    }

    public static int BruteFore(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return nums[i];
            }

        }
        return -1;
    }


    public static int Optimal(int[] nums){
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        
        return  xor;

    }

}
