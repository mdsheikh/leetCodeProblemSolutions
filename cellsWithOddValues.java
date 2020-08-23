
public class cellsWithOddValues {

    public int oddCells(int n, int m, int[][] indices) {

        int[] row = new int[n];
        int[] col = new int[m];
        int count = 0;
        for (int[] cell : indices) {
            row[cell[0]]++;
            col[cell[1]]++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                count += (row[i] + col[j]) % 2;

            }
        }
        return count;
    }

}