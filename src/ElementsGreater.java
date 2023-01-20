public class ElementsGreater {
	public static void main(String[] args) {
		int[] arr = {100, 34, 53, 121, 42, 6};

		elementsGreater(arr);
	}

	public static void elementsGreater(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean broken = false;
			for (int j = i; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					broken = true;
					break;
				}
			}

			if (!broken) System.out.print(arr[i] + (i == arr.length-1 ? "" : ", "));
		}
	}
}
