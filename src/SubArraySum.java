import java.util.Arrays;

public class SubArraySum {
	public static void main(String[] args) {
		int[] arr = {2, 6, 0, 9, 7, 3, 1, 10, 2, 3};
		int sum = 15;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int[] sub = Arrays.copyOfRange(arr, i, j+1);
				if (arrSum(sub) == sum) {
					System.out.printf("Subarray %s exists with sum %d\n", Arrays.toString(sub), sum);
				}
			}
		}
	}

	static int arrSum(int[] arr) {
		int total = 0;
		for (int i : arr) {
			total += i;
		}

		return total;
	}
}
