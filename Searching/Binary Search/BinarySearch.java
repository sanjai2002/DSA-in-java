
class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 8, 9, 12, 13, 15};
        int target = 123;
        System.out.println(FindIndex(arr, target));
    }
    public static int FindIndex(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
