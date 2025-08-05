import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int N = sc.nextInt();
		int result = 0;
		
		//A*a + B*b + C*c = N
		for(int a = 0; a < N/A; a++) {
			for(int b = 0; b < N/B; b++) {
				for(int c = 0; c < N/C; c++) {
					if(A*a + B*b + C*c == N) {
						result = 1;
						break;
					}
				}
			}
		}
		
		System.out.println(result);
	}

}
