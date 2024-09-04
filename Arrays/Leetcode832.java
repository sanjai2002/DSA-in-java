

public class Leetcode832 {
 public static void main(String[] args) {
    int[][] image={{1,1,0},{1,0,1},{0,0,0}};
    int[][] ans=flipAndInvertImage(image);
    for(int i=0;i<ans.length;i++){
        for(int j=0;j<ans[i].length;j++){
            System.out.print(ans[i][j]);
        }
        System.out.println();
    }
    
 }

 public static int[][] flipAndInvertImage(int[][] image) {
    for(int i = 0; i < image.length; i++) {
        int[] temp = new int[image[i].length];
        for(int j = 0; j < image[i].length; j++) {
         
            temp[j] = image[i][image[i].length - j - 1];
        }
       
        image[i] = temp;
    }
    // Invert the image
    for(int i = 0; i < image.length; i++) {
        for(int j = 0; j < image[i].length; j++) {
            if(image[i][j] == 0) {
                image[i][j] = 1;
            } else {
                image[i][j] = 0;
            }
        }
    }
    return image;
    
}
    
}
