public class MatrixMath {

    public int determinantTwoByTwo() {

        return 0;
    }

    public static int[][] scale(int[][] arr, int scaleFactor) {

        int[][] newArr = new int[arr.length][arr[0].length];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                newArr[r][c] = scaleFactor * arr[r][c];
            }
        }
        return newArr;
    }

    public static int[][] multiply(int[][] arr1, int[][] arr2) {
        int[][] newArr = new int[arr1.length][arr2[0].length];
        for (int r = 0; r < arr1.length; r++) {
            for (int c = 0; c < arr2[r].length; c++) {
                newArr[r][c] = arr1[r][c] * arr2[c][r];
            }
        }
        return newArr;
    }

    public static int TwoByTwoDet(int[][] arr) {
        int[][] arr1 = new int[2][2];
        int det;
        det = (arr1[0][0] * arr[1][1]) - (arr[0][1] * arr[1][0]);
        return det;
    }

    public static int threeByThreeDet(int[][] arr) {
        int[][] arr1 = new int[3][3];
        int det;
        det = (arr1[0][0] * ((arr[1][1] * arr[2][2]) - (arr[1][2] * arr[2][1]))) - (arr1[0][1] * ((arr[1][0] * arr[2][2]) - (arr[1][2] * arr[2][0]))) + (arr1[0][2] * ((arr[1][0] * arr[2][1]) - (arr[1][1] * arr[2][0])));
        return det;
    }
}
