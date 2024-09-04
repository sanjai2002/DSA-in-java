
class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 65, 32, 31, 56, 2};
        int target = 31;
        System.out.println(FindElement(arr, target));
    }
    public static int FindElement(int[] arr, int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return  -1;
    }
}
