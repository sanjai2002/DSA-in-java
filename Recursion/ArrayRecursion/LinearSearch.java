
public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        
        // boolean ans = FineElement(arr, 7, 0);
        // System.out.println(ans);
        System.out.println(FindIndex(arr, 7, 0));

    }

    static boolean FineElement(int[] arr, int target, int index) {
        if(arr.length==index){
            return  false;
        }
        return arr[index]==target || FineElement(arr,target,index+1);
    }

    
    static int FindIndex(int[] arr, int target, int index){
         if(arr.length==index){
            return  -1;
        }
        if(arr[index]==target){
            return  index;
        }
        else{
            return FindIndex(arr,target,index+1);
        }

    }

}
