import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int count = 0;
		for (int a = 1; a <= N / 3; a++) {
			for (int b = 1; b <= N / 3; b++) {
				for (int c = 1; c <= N / 3; c++) {
					if (3 * (a + b + c) == N) {
						count++;
					}
				}
			}
		}

		System.out.println(count);

	}

}
