public class Leetcode169 {
    public static void main(String[] args) {
        int[] nums={2, 2, 1, 1, 1, 2, 2};
        System.out.println(moorevotingalgo(nums));
    }
    
     public static int majorityElement(int[] nums) {
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            int count =0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
                if(count>n/2) return nums[i];
            }
        }
        return  -1;
    }   

//moore voting algorithm
    public static int moorevotingalgo(int[] nums){
        int n=nums.length;
        int count=0;
        int e1=0;
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                e1=nums[i];
            }
            else if(e1==nums[i]) count++;
            else count--;
        }
        int count1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==e1) count1++;
        }

        if(count1>(n/2)) return e1;
        return  -1;
    }

    
}
