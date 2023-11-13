package Matrix;

import java.util.Arrays;

public class Matrix_in_zig_zag_fashion {
  public static int[] solution1(int[][] matrix){
    final int m = matrix.length;
    final int n = matrix[0].length;
    int[] ans = new int[m*n];
    int d = 1;
    int row = 0;
    int col = 0;
    for (int i = 0; i < m * n; ++i) {
      ans[i] = matrix[row][col];
      row -= d;
      col += d;
      System.out.println(col);
      // Out of bound
      if (row == m) {
        row = m - 1;
        col += 2;
        d = -d;
      }
      if (col == n) {
        col = n - 1;
        row += 2;
        d = -d;
      }
      if (row < 0) {
        row = 0;
        d = -d;
      }
      if (col < 0) {
        col = 0;
        d = -d;
      }
    }
    return ans;
    
  }
  public static void main(String[] args) {
    int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      System.out.println(Arrays.toString(solution1(matrix)));

  }
}
