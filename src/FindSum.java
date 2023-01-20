import java.util.ArrayList;
import java.util.HashMap;

public class FindSum {
	public static void main(String[] args) {
		int[] arr = {8, 7, 2, 5, 3, 1};
		int sum = 10;

		nSquared(arr, sum);
	}
	public static void nSquared(int[] arr, int sum) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.printf("Pair found at index %d and %d (%d + %d)\n", i, j, arr[i], arr[j]);
				}
			}

		}
	}
}
