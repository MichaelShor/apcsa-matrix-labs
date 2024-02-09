public class MatrixMath {

    public static int[][] scale(int[][] arr, int scaleFactor) {
// loops through the input array and for every value in the old array it scales it up by scaleFactor and
        // moves that new value to the same spot in the new array
        int[][] newArr = new int[arr.length][arr[0].length];
            for (int r = 0; r < arr.length; r++) {
                for (int c = 0; c < arr[r].length; c++) {
                    newArr[r][c] = scaleFactor * arr[r][c];
                }
            }
        return newArr;
    }

    public static int[][] multiply(int[][] arr1, int[][] arr2) {
        // loops through rows of first matrix and columns of second array and then multiples the two values
        // and stores the new value in the new array
        int[][] newArr = new int[arr1.length][arr2[0].length];
        for (int r = 0; r < arr1.length; r++) {
            for (int c = 0; c < arr2[r].length; c++) {
                for (int a = 0; a<arr1[0].length; a++) {
                    int sum = 0;
                    sum += arr1[r][a] * arr2[a][r];
                    newArr[r][c] = sum;
                }
            }
        }
        return newArr;
    }

    public static int TwoByTwoDet(int[][] arr) {
        // if the matrix is square or 2 by 2 then calc two by two det else return 0
        if (arr.length == arr[0].length) {
            int det = (arr[0][0] * arr[1][1]) - (arr[0][1] * arr[1][0]);
            return det;
        }
        else {
            System.out.println("Invalid Array");
            return 0;
        }
    }

    public static int threeByThreeDet(int[][] arr) {
        // if the matrix is square or 3 by 3 then calc three by three det else return 0 based on formula
        if (arr.length == arr[0].length) {
            int det = (arr[0][0] * ((arr[1][1] * arr[2][2]) - (arr[1][2] * arr[2][1]))) - (arr[0][1] * ((arr[1][0] * arr[2][2]) - (arr[1][2] * arr[2][0]))) + (arr[0][2] * ((arr[1][0] * arr[2][1]) - (arr[1][1] * arr[2][0])));
            return det;
        }
        else {
            System.out.println("Invalid Array");
            return 0;
        }
    }
}
