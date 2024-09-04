
import java.util.Arrays;

public class LeftRotation {

    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        // System.out.println(Arrays.toString(optimal(arr)));
        int [] arr={1,2,3,4,5,6,7};
        int k =3;
        System.out.println(Arrays.toString( Rotatetoleft(arr,k)));
       
    }

    public static int[] BruteForce(int[] arr) {
        int temp[] = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            temp[i - 1] = arr[i];
        }
        temp[arr.length - 1] = arr[0];
        return temp;
    }

    public static int[] optimal(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];

        }
        arr[arr.length - 1] = temp;
        return arr;
    }

    public static int[] Rotatetoleft(int[] arr,int k ){
        int n=arr.length;
        int[] temp=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            arr[i]=arr [i+k];
        }
        for(int i=n-k;i<n;i++){
            arr[i]=temp[i-(n-k)];
            
        }
        return  arr;
    }
    

}
