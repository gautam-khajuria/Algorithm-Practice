public class DuplicatesOfRange {
	public static void main(String[] args) {
		int[] nums = { 6, 8, 2, 4, 5, 9 };
		int k = 4;

		if(duplicatesOfRange(nums, k)) {
			System.out.println("Duplicates Found!");
		} else {
			System.out.println("No Duplicates were found!");
		}
	}

	public static boolean duplicatesOfRange(int[] nums, int k) {
		for (int i = 0; i < nums.length; i++) {
			if (i+k+1 > nums.length) return false;

			for (int j = i+1; j < i+k+1; j++) {
				if (nums[i] == nums[j]) return true;
			}
		}

		return false;
	}
}
