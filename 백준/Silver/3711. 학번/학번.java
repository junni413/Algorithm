
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 학번은 최대 6자리 0 ~ 999,999
		int N = sc.nextInt();

		for (int tc = 1; tc <= N; tc++) {
			int G = sc.nextInt();

			int[] studentId = new int[G]; // 학번

			for (int i = 0; i < G; i++) { // 학번 저장
				studentId[i] = sc.nextInt();
			}

			int result = 0; // 결과

			for (int m = 1; m <= 999999; m++) {
				int success = 0; // 성공 여부
				int[] modArr = new int[G]; // 나머지를 기록할 배열
				Arrays.fill(modArr, -1);
				for (int i = 0; i < G; i++) {
					int mod = studentId[i] % m;
					int tmp = 1;
					// 같은 나머지가 있는지 확인
					for (int x : modArr) { 
						if (x == mod) {
							tmp = 0;
						}
					}
					//나머지 기록할지 말지
					if (tmp == 1) {
						modArr[i] = mod;
						success = 1;
					} else {
						success = 0;
						break;
					}

				}
				if (success == 1) {
					result = m;
					break;
				}
			}

			System.out.println(result);
		}

	}

}
