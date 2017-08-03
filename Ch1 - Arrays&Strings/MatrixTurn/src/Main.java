public class Main {

    // Turn a square matrix by 90 degrees
    public static void main(String[] args){
            int[][] a = {{1,2,3},{5,5,6},{7,8,9}};

            System.out.println("Reversed matrix : ");
            int[][] b = reverseMatrix(a);
            for (int i=0; i<b.length; i++){
                for (int j=0; j<b.length; j++){
                    System.out.println(" " + b[i][j]);
                }
            }
    }

    public static int[][] reverseMatrix(int[][] a){
        int[][] b = new int[a.length][a.length];
        int k = a.length-1;
        for (int i=0;i<a.length; i ++){
            for (int j=0; j<a.length; j++){
                b[j][k]=a[i][j];
            }
            k--;
        }

        return b;
    }
}
