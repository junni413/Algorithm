import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 주사위 입력받기
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();

		// 합이 나오는 횟수를 count할 배열
		int N = s1 + s2 + s3;
		int[] count = new int[N + 1];

		// 합이 나오는 모든 경우의 수 체크
		for (int a = 1; a <= s1; a++) {
			for (int b = 1; b <= s2; b++) {
				for (int c = 1; c <= s3; c++) {
					int sum = a + b + c;
					count[sum] += 1;
				}
			}
		}

		// 최빈값 찾기
		int max = 0;
		int min_index = 100;
		for (int i = 0; i < count.length; i++) {
			if (max < count[i]) {	//이후에 나오는 같은 max 값은 갱신되지 않아서 min_index 유지 가능
				max = count[i];
				min_index = i;
			}
		}

		System.out.println(min_index);

	}

}
