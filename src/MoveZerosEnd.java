import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZerosEnd {
	public static void main(String[] args) {
		int[] arr = {6, 0, 7, 2, 3, 0, 4, 0, 1};

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr = remove(arr, i);
				arr = appendZero(arr);
			}
		}

		System.out.println(Arrays.toString(arr));
	}

	static int[] remove(int[] og, int index) {
		int[] newArr = new int[og.length-1];

		int j = 0;
		for (int i = 0; i < og.length; i++) {
			if (i == index) continue;

			newArr[j] = og[i];

			j++;
		}

		return newArr;
	}

	static int[] appendZero(int[] og) {
		return Arrays.copyOf(og, og.length+1);
	}


}
