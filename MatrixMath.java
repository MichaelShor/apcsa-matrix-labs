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
}
