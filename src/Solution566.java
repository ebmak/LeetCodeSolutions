
import java.util.Arrays;

public class Solution566 {

	public static void main(String[] args) {
		Solution566 o = new Solution566();
		int[][] array = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		System.out.println(Arrays.deepToString(o.matrixReshape(array, 1, 1)));
	}

	public int[][] matrixReshape(int[][] nums, int r, int c) {

		int col = nums[0].length;
		int row = nums.length;

		if (row * col < r * c)
			return nums;

		int[] reshape = new int[r * c];
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++) {
				if ((i * col + j) >= r * c)
					break;
				reshape[i * col + j] = nums[i][j];
			}

		int[][] result = new int[r][c];
		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				result[i][j] = reshape[i * c + j];

		return result;
	}

}
