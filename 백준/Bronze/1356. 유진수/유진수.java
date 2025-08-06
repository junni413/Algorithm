import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int len = (int)(Math.log10(N)+1);
		int[] arr = new int[len];
		int tmp = N;
		
		if(len == 1) { //한 자리수는 유진수X
			System.out.println("NO");
			return;
		}
		
		for(int i = 0; i < arr.length; i++) {	// 한자리씩 끊어서 배열에 저장
			arr[i] = tmp / (int)(Math.pow(10, len-1-i));
			tmp = tmp % (int)(Math.pow(10, len-1-i));
		}
		
		int success = 0;
		for(int i = 0; i < arr.length; i++) { //앞-뒤 경계선 한칸씩 증가
			int num1 = 1;
			int num2 = 1;
			for(int j = 0; j <= i; j++) {	//앞부분 자리수의 곱
				num1 *= arr[j];
			}
			for(int k = i+1; k < arr.length; k++) {	//뒷부분 자리수의 곱
				num2 *= arr[k];
			}
			if(num1 == num2) {
				System.out.println("YES");
				success = 1;
				break;
			}
		}
		if(success == 0)
			System.out.println("NO");

	}

}
