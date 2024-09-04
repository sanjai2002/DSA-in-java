
class PatternProgram {

    public static void main(String[] args) {
        Pattern34(5);
        
    }

    public static void Pattern1(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void Pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void Pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }

    }

    public static void Pattern5(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalcol = row >= n ? 2 * n - row : row;
            for (int col = 1; col <= totalcol; col++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void Pattern6(int n) {

        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void Pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space < row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern8(int n) {
        for (int row = 1; row <= n; row++) {

            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row + (row - 1); col++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void Pattern9(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n * 2 - row - (row - 1); col++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

    public static void Pattern10(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }

    public static void Pattern11(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }

            System.out.println();

        }

    }

    public static void Pattern12(int n) {
        for (int row = 1; row <= n * 2; row++) {
            int totalspaces = row < n ? row - 1 : 2 * n - row;
            for (int space = 1; space <= totalspaces; space++) {
                System.out.print(" ");
            }
            int totalcoloums = row > n ? row - n : n - row + 1;
            for (int col = 1; col <= totalcoloums; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void Pattern13(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1 || row == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void Pattern14(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n * 2 - row - (row - 1); col++) {
                if (row == 1 || col == 1 || col == n * 2 - row - (row - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }

    public static void Pattern15(int n) {
        for (int row = 1; row <= n * 2 - 1; row++) {
            int totalspace = row < n ? n - row : row - n;
            for (int space = 1; space <= totalspace; space++) {
                System.out.print(" ");
            }
            int totalcol = row < n ? row * 2 - 1 : (n * 2 - row) * 2 - 1;
            for (int col = 1; col <= totalcol; col++) {
                if (col == 1 || col == totalcol) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }

            System.out.println();

        }

    }

    public static void Pattern17(int n) {
        for(int row=1;row<=n*2-1;row++){
    
             int totalspace = row < n ?  row :2*n-row;
            for (int space = 1; space <= n-totalspace; space++) {
                System.out.print(" ");
            }
            for(int col=totalspace;col>=1;col--){
                System.out.print(col);
            }
             for(int col=2 ;col<=totalspace;col++){
                System.out.print(col);
            }


            System.out.println();
        }

    }

    public static void Pattern18(int n) {
        for (int row = 1; row <= n * 2; row++) {
            int FirstCol = row <= n ? n - row + 1 : row - n;
            for (int col1 = 1; col1 <= FirstCol; col1++) {
                System.out.print("*");
            }
            int totalspace = row <= n ? row * 2 - 2 : (n * 2 - row) * 2;
            for (int space = 1; space <= totalspace; space++) {
                System.out.print(" ");
            }
            for (int col1 = 1; col1 <= FirstCol; col1++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void Pattern19(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalcol = row <= n ? row : 2 * n - row;
            for (int col = 1; col <= totalcol; col++) {
                System.out.print("*");
            }
            int totalspace = row <= n ? (n * 2) - (row * 2) : (row - n) * 2;
            for (int space = 1; space <= totalspace; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalcol; col++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void Pattern20(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < n; col++) {
                if (row == 1 || row == n || col == 1 || col == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }

    public static void Pattern21(int n) {
        int number = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }

    }

    public static void Pattern22(int n) {
        for (int row = 1; row <= n; row++) {
            int ans = (row % 2) == 0 ? 0 : 1;
            for (int col = 1; col <= row; col++) {
                System.out.print(ans + " ");
                ans = 1 - ans;
            }
            System.out.println();
        }

    }


    public static void Pattern26(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print(row);
            }
            System.out.println();
        }
    }

    // public static void Pattern27(int n){
    //     int ans=1;
    //     for(int row=1;row<=n;row++){
    //         for(int space=1;space<=row-1;space++){
    //             System.out.print(" ");
    //         }
    //         for(int col=1;col<=(2 * (n - row + 1) - 1);col++){
    //             System.out.print(ans+" ");
    //             ans++;
    //         }
    //         System.out.println();
    //     }

    // }

    public static void Pattern28(int n) {
        for (int row = 1; row <= n * 2 - 1; row++) {
            int totalspace = row < n ? n - row : row - n;
            for (int space = 1; space <= totalspace; space++) {
                System.out.print(" ");
            }
            int totalcol = row < n ? row * 2 - 1 : (n * 2 - row) * 2 - 1;
            for (int col = 1; col <= totalcol; col++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

    public static void Pattern29(int n){
            for(int row=1;row<=n*2-1;row++){
                int totalcol=row<=n?row:n*2-row;
                for(int col=1;col<=totalcol;col++){
                    System.out.print("*");
                }
                int totalspace=row<=n?(n*2)-(row*2):(row-n)*2;
                for(int space=1;space<=totalspace;space++){
                    System.out.print(" ");
                }
                for(int col=1;col<=totalcol;col++){
                    System.out.print("*");
                }


            
                System.out.println();
            }

    }

    public static void Pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col);
            }
            for(int col=2;col<=row;col++){
                System.out.print(col);
            }
        

            System.out.println();
        }
    }

    public static void Pattern31(int n){
        int originalN=n;
        n=2*n;
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                int ans=originalN-Math.min(Math.min(row,col),Math.min(n-row, n-col));
                System.out.print(ans+" ");
            }
            System.out.println();
        }
    }

    public static void Pattern32(int n){
           for (int i = 0; i < n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }


    public static void Pattern34(int n){
        for(int row=0;row<n;row++){
            for(char ch=(char)('E'-row);ch>='A';ch--){
                 System.out.print(ch + " ");
            }
             System.out.println();
            
        }
        
    }
    public static void Pattern35(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            for(int space=1;space<=(n-row)*2;space++){
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col);
            }
            System.out.println();
        }
        
    }
    //  public static void Pattern2(int n){
    // }
}
