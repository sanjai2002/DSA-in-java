
class Leetcode268 {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int n=nums.length+1;
        for(int i=0;i<=n;i++){ 
            int flag=0;  
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]){
                    flag=1;
                    break;

                }
            }
            if(flag==0){
                return  i;
            }
        }

        
        return  -1;

    }
}
