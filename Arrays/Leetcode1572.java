
public class Leetcode1572 {

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int ans = diagonalSum(mat);
        System.out.println(ans);
    }

    public static int diagonalSum(int[][] mat) {
        int ans = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(i==j){
                    ans += mat[i][j];
                    continue;
                }
                if(i+j==mat.length-1){
                    ans += mat[i][j];  
                }
            }
        }
        return ans;
    }
}
