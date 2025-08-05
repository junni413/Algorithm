import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();	//양 사료
		int b = sc.nextInt();	//염소 사료
		int n = sc.nextInt();	//양과 염소 전체
		int w = sc.nextInt();	//하루 동안 소비한 전체 사료
		
		int sheep = 0;
		int goat = 0;
		
		int ans = 0;
		
		for(int i = 1; i < n; i++) {
			if(i*a + (n-i)*b == w) {
				ans++;
				sheep = i;
				goat = n - i;
			}
		}
		
		if(ans == 1)
			System.out.println(sheep + " " + goat);
		else
			System.out.println(-1);
		
		
	}

}
