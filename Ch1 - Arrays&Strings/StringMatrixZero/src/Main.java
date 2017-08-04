public class Main {

    // if elements is zero, set row and column to zero
    public static void main(String[] args) {

        int[][] a = {{1, 0, 3, 7}, {5, 5, 6, 9}, {7, 8, 9, 5}};


        System.out.println("Before matrix : ");
        printMatrix(a);
        int[][] b = setZeros(a);
        System.out.println("After matrix : ");
        printMatrix(b);

    }

    public static void printMatrix(int[][] b) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.println(" " + b[i][j]);
            }
        }
    }


    public static int[][] setZeros(int[][] b) {
        System.out.println("a.length" + b.length);
        System.out.println("a0.length" + b[0].length);
        int[][] helper = new int[b.length][b[0].length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                if (b[i][j] == 0)
                    setZero(i, j, helper);
            }
        }
         for (int i = 0; i < b.length; i++) {
             for (int j = 0; j < b[0].length; j++) {
                 if (helper[i][j] == 1)
                     b[i][j] = 0;
             }                                      
         }
         return b;
    }

    public static void setZero(int i, int j, int[][] helper) {
        for (int l = 0; l < helper.length; l++) {
            helper[l][j] = 1;
        }
        for (int k = 0; k < helper[0].length; k++) {
            helper[i][k] = 1;
        }
    }

}
