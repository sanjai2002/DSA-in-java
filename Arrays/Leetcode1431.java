
import java.util.ArrayList;
import java.util.List;

public class Leetcode1431 {

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println(result);



    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int maxcandie = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > maxcandie) {
                maxcandie = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            list.add(candies[i]+extraCandies>=maxcandie);
        }
        return  list;

    }

}
