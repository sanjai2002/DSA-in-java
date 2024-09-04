import java.util.ArrayList;
public class Arraylist {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 7};
        
        System.out.println(FindAllElements(arr, 4, 0,new ArrayList<>()));

    }

    public static ArrayList<Integer> FindAllElements(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);

        }

        return FindAllElements(arr, target, index + 1, list);
    }

}
