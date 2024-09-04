
import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode283 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
       System.out.println(Arrays.toString(arr));
    }

    public static int[] moveZeroes(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp.add(nums[i]);
            }
        }
        int n = temp.size();
        for (int i = 0; i < n; i++) {
            nums[i] = temp.get(i);
        }
        for (int i = n; i < nums.length; i++) {
            nums[i] = 0;
        }
        return  nums;

    }

}
