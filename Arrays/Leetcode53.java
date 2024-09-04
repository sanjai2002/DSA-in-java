public class Leetcode53 {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4,-2};
        System.out.println(KadaneAlgorithm(nums));
        
    }

    public static int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=nums[k];
                }
                max=Math.max(max,sum);
            }
        }
        return  max;
        
    }
    //kadane Algorithm
    public static int KadaneAlgorithm(int[] nums){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return  max;


    }




    
}
