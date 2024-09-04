
import java.util.Arrays;

class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void Bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }    

    }

}
