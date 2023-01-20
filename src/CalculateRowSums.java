import java.util.Arrays;

public class CalculateRowSums {
	public static void main(String[] args) {
		int[][] test = {{1, 2, 6}, {5, 9, 2}, {7, 1, 4}, {3, 8, 6}};

		System.out.println(Arrays.toString(allSum(test)));
	}

	static Integer[] allSum(int[][] array) {
		return Arrays.stream(array).map(CalculateRowSums::rowSum).toArray(Integer[]::new);
	}

	static int rowSum(int[] row) {
		return Arrays.stream(row).sum();
	}
}
