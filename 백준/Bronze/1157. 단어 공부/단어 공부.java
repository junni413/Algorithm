import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//알파벳 등장 횟수를 기록할 배열
		int[] arr = new int[26];
		
		String str = sc.next();
		
		//a의 아스키코드 = 97, A의 아스키코드 = 65
		for(int i = 0; i < str.length(); i++) {
			char tmp = str.charAt(i);
			int idx = 0;

			if(tmp >= 'A' && tmp <='Z') { //대문자
				idx = tmp - 65;
				arr[idx]++;
			}else if(tmp >= 'a' && tmp <= 'z') { //소문자
				idx = tmp - 97;
				arr[idx]++;
			}
			
		}
		
		int max = 0, count = 0, answer = 0;
		//최댓값 찾기
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				answer = i;
				count = 1;
			}else if(arr[i] == max) {
				count++;
			}
		}
		
		//결과 출력
		if(count == 1) {
			System.out.println((char)(answer+65));
		}else {
			System.out.println("?");
		}
	}

}
