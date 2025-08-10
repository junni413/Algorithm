import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = 9;
		int[][] arr= new int[N][N];
		
		int max = 0;
		int r = 0, c = 0;
		//배열 입력받기
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
				if(arr[i][j] > max) {
					r = i; c = j;
					max = arr[i][j];
				}
			}
		}
		
		System.out.println(max);
		System.out.println((r+1) + " " + (c+1));

	}

}
