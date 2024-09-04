
public class Leetcode1732 {

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        int ans = largestAltitude(gain);
        System.out.println(ans);

    }

    public static int largestAltitude(int[] gain) {
        int currentAltitude = 0, highetAltitude = 0;
        for (int i = 0; i < gain.length; i++) {
            currentAltitude = currentAltitude + gain[i];
            if (currentAltitude > highetAltitude) {
                highetAltitude = currentAltitude;
            }
        }

        return highetAltitude;
    }

}
