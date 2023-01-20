import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Column or row? (1 or 2)");
		int input = scan.nextInt();

		String[][] bingoCards = new String[5][5];
		if (input == 1) {
			for (int i = 0; i < bingoCards.length; i++) {
				bingoCards[i] = new String[] {"", "", "", "", "Called"};
			}

			System.out.printf("Column: %d", checkWonColumn(bingoCards));
		} else if (input == 2) {
			bingoCards[2] = new String[] {"Called", "Called", "Called", "Called", "Called"};
			for (int i = 0; i < bingoCards.length; i++) {
				if (i == 2) continue;
				bingoCards[i] = new String[] {"", "", "", "", ""};
			}

			System.out.printf("Row: %d", checkWonRow(bingoCards));
		} else {
			System.out.println("DUMBASS 1 OR 2");
		}
	}

	public static int checkWonColumn(String[][] bingoCard) {
		for (int i = 0; i < bingoCard.length; i++) {
			boolean called = false;
			for (int j = 0; j < bingoCard[i].length; j++) {
				called = bingoCard[j][i].equals("Called");
			}
			if (called) return i;
		}

		return -1;
	}

	public static int checkWonRow(String[][] bingoCard) {
		for (int i = 0; i < bingoCard.length; i++) {
			boolean called = false;
			for (int j = 0; j < bingoCard[i].length; j++) {
				called = bingoCard[i][j].equals("Called");
			}
			if (called) return i;
		}

		return -1;
	}
}