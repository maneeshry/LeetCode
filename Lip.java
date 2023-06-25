public class Lip {
  private int[][] memo; // memoization array to store the longest path from each cell
  private int[][] matrix; // input matrix
  private int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}}; // directions to explore adjacent cells
  
  public int longestIncreasingPath(int[][] matrix) {
      if (matrix == null || matrix.length == 0) {
          return 0;
      }
      int m = matrix.length;
      int n = matrix[0].length;
      this.memo = new int[m][n];
      this.matrix = matrix;
      int longestPath = 0;
      for (int i = 0; i < m; i++) {
          for (int j = 0; j < n; j++) {
              longestPath = Math.max(longestPath, dfs(i, j));
          }
      }
      return longestPath;
  }
  
  private int dfs(int i, int j) {
      if (memo[i][j] > 0) {
          return memo[i][j];
      }
      int longestPath = 1; // minimum path length is always 1
      for (int[] direction : directions) {
          int x = i + direction[0];
          int y = j + direction[1];
          if (x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length && matrix[x][y] > matrix[i][j]) {
              int pathLength = 1 + dfs(x, y); // path length through current cell
              if (pathLength > longestPath) {
                  longestPath = pathLength;
              }
          }
      }
      memo[i][j] = longestPath; // memoize the result
      return longestPath;
  }
  
  public void printLongestIncreasingPath(int[][] matrix) {
      int longestPath = longestIncreasingPath(matrix);
      System.out.println("Longest increasing path length: " + longestPath);
      for (int i = 0; i < matrix.length; i++) {
          for (int j = 0; j < matrix[0].length; j++) {
              if (memo[i][j] == longestPath) {
                  System.out.print(matrix[i][j] + " ");
                  printPath(i, j, longestPath);
                  System.out.println();
              }
          }
      }
  }
  
  private void printPath(int i, int j, int pathLength) {
      if (pathLength == 1) {
          return; 
      }
      for (int[] direction : directions) {
          int x = i + direction[0];
          int y = j + direction[1];
          if (x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length && memo[x][y] == pathLength - 1) { 
              System.out.print(matrix[x][y] + " ");
              printPath(x, y, pathLength - 1);
              break;
          }
      }
  }
  
  public static void main(String[] args) {
      int[][] matrix = {{9, 9, 4}, {6, 6, 8}, {2, 1, 1}, {7, 5, 3}};
      Lip lip = new Lip();
      lip.printLongestIncreasingPath(matrix);
  }
}
