import java.util.Scanner;

public class Assignment {
	static Scanner fetch = new Scanner(System.in);

	public static void main(String[] args) {

		double[] Alpha = new double[50];

		for (int i = 0; i < 25; i++) {
			Alpha[i] = i * i;

		}
		for (int j = 25; j < 50; j++) {
			Alpha[j] = j * 3;
		}

		for (int z = 0; z < 50; z++) {
			System.out.print(Alpha[z] + " ");
			if ((z + 1) % 10 == 0) {
				System.out.println();
			}

		}

		/// Number 2 Problem Solved:

		int[] student = new int[8];
		for (int i = 0; i < 8; i++) {
			student[i] = 0;
		}

		for (int i = 0; i < 25; i++) {
			System.out.print("Enter a test score: ");
			int score = fetch.nextInt();
			if (score >= 0 && score <= 24) {
				student[0]++;
			} else if (score >= 25 && score <= 49) {
				student[1]++;
			} else if (score >= 50 && score <= 74) {
				student[2]++;
			} else if (score >= 75 && score <= 99) {
				student[3]++;
			} else if (score >= 100 && score <= 124) {
				student[4]++;
			} else if (score >= 125 && score <= 149) {
				student[5]++;
			} else if (score >= 150 && score <= 174) {
				student[6]++;
			} else if (score >= 175 && score <= 200) {
				student[7]++;
			}
		}

		System.out.println("\nScore Ranges: Number of Students");
		System.out.println("0-24: " + student[0]);
		System.out.println("25-49: " + student[1]);
		System.out.println("50-74: " + student[2]);
		System.out.println("75-99: " + student[3]);
		System.out.println("100-124: " + student[4]);
		System.out.println("125-149: " + student[5]);
		System.out.println("150-174: " + student[6]);
		System.out.println("175-200: " + student[7]);

	}

}
