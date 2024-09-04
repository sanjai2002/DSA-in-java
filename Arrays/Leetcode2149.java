import java.util.ArrayList;
import java.util.Arrays;
public class Leetcode2149 {
    public static void main(String[] args) {
        int[] nums={3,1,-2,-5,2,-4};
        rearrangeArray(nums);
        System.out.println(Arrays.toString(BetterSolution(nums)));
    
        
    }`
//BruteForce Solutions
    public static int[] rearrangeArray(int[] nums) {
        ArrayList<Integer>positive=new ArrayList<>();
        ArrayList<Integer>Negative=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                positive.add(nums[i]);
            }
            else{
                Negative.add(nums[i]);
            }
        }

        for(int i=0;i<nums.length/2;i++){
            nums[i*2]=positive.get(i);
            nums[i*2+1]=Negative.get(i);

        }

    return  nums;
        
    }    


    //Better Solution 
    public static int[]  BetterSolution(int[] nums){
        int[] ans=new int[nums.length];
        int Positive=0; int Negative=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[Positive]=nums[i];
                Positive+=2;
                
            }
            else{
                ans[Negative]=nums[i];
                Negative+=2;
            }

        }

        
        return  ans;

    }
}
