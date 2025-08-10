import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//알파벳 등장 횟수를 기록할 배열
		int[] arr = new int[26];
		
		String str = sc.next();
		
		//a의 아스키코드 = 97
		for(int i = 0; i < str.length(); i++) {
			int idx = str.charAt(i) - 97;
			arr[idx]++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
