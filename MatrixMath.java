public class MatrixMath {

    public int determinantTwoByTwo() {

    }

    public static int[][] scale(int[][] arr, int scaleFactor) {

        int[][] newArr = new int[0][];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                newArr[r][c] = scaleFactor * arr[r][c];
            }
        }
        return newArr;
    }
}
