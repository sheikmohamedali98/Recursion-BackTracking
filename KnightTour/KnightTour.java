package KnightTour;

public class KnightTour {

	// If visited for back track
	private static boolean isVisited(int N, int newRow, int newCol, int[][] matrix) {
		return (newRow >= 0 && newCol >= 0 && newRow < N && newCol < N && matrix[newRow][newCol] == -1);
	}

	public void printSolution(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix.length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
	}

	public boolean knightTour(int N, int row, int col, int move, int[][] matrix, int[] rowPath, int[] colPath) {
		if (move == N * N) {
			return true;
		}
		for (int i = 0; i < rowPath.length; i++) {
			int newRow = row + rowPath[i];
			int newCol = col + colPath[i];
			if (isVisited(N, newRow, newCol, matrix)) {
				matrix[newRow][newCol] = move;
				if (knightTour(N, newRow, newCol, move + 1, matrix, rowPath, colPath)) {
					return true;
				} else {
					matrix[newRow][newCol] = -1;
				}
			}
		}
		return false;
	}
}
