//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
	
	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
		this.grid = grid;
	}
	
	
	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public void clearRows() {
		int width = grid.length;
		int height = grid[0].length;
		boolean[][] newGrid = new boolean[width][height];

		int newRow = 0;

		for (int y = height - 1; y >= 0; y--) {
			boolean isRowFull = true;

			for (int x = 0; x < width; x++) {
				if (!grid[x][y]) {
					isRowFull = false;
					break;
				}
			}

			if (!isRowFull) {
				for (int x = 0; x < width; x++) {
					newGrid[x][newRow] = grid[x][y];
				}
				newRow++;
			}
		}
		for (int y = newRow; y < height; y++) {
			for (int x = 0; x < width; x++) {
				newGrid[x][y] = false; // Hàng trống
			}
		}

		// Cập nhật grid cũ với grid mới
		grid = newGrid;
	}
	
	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	public boolean[][] getGrid() {
		return grid; // YOUR CODE HERE
	}
}
