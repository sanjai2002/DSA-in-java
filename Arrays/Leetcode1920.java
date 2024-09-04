import java.util.Arrays;

class Leetcode1920{
    public static void main(String[] args) {
        int[] nums={5,0,1,2,3,4};
        int ans[]=buildArray(nums);
        System.out.println(Arrays.toString(ans));

        
    }

     public static int[] buildArray(int[] nums) {
        int[] result=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            result[i]=nums[temp];
        }
        return  result; 
        
    }

}