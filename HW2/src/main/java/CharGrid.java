// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
		int minRow = -1, maxRow = -1, minCol = -1, maxCol = -1;

		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[r].length; c++) {
				if (grid[r][c] == ch) {
					if (minRow == -1) {
						minRow = r;
						minCol = c;
					}
					maxRow = Math.max(maxRow, r);
					maxCol = Math.max(maxCol, c);
				}
			}
		}

		if (minRow == -1) {
			return 0;
		}

		int width = maxCol - minCol + 1;
		int height = maxRow - minRow + 1;
		return width * height; // YOUR CODE HERE
	}
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
		int count = 0;

		for (int r = 0; r < grid.length; r++) {
			for (int c = 0; c < grid[r].length; c++) {
				char ch = grid[r][c];
				if (ch != ' ' && isPlusShape(r, c, ch)) {
					count++;
				}
			}
		}

		return count;
	}

	private boolean isPlusShape(int row, int col, char ch) {
		int up = 0, down = 0, left = 0, right = 0;

		for (int r = row - 1; r >= 0 && grid[r][col] == ch; r--) {
			up++;
		}
		for (int r = row + 1; r < grid.length && grid[r][col] == ch; r++) {
			down++;
		}
		for (int c = col - 1; c >= 0 && grid[row][c] == ch; c--) {
			left++;
		}
		for (int c = col + 1; c < grid[row].length && grid[row][c] == ch; c++) {
			right++;
		}

		return (up >= 1 && down >= 1 && left >= 1 && right >= 1);
	}
	
}
