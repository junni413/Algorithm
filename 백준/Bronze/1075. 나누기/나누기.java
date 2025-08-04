import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int F = sc.nextInt();
		
		int num = (N / 100)*100;
		int tmp = num % F;
		if(tmp == 0) {
			System.out.println(String.format("%02d", num % 100));
		}
		else {
			num += (F-tmp);
			System.out.println(String.format("%02d", num % 100));
		}
	}

}
