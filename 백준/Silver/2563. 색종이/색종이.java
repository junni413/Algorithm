import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 100;
		int[][] map = new int[N][N];
		
		int num = sc.nextInt(); //색종이의 수
		
		for(int k = 0; k < num; k++) { //색종이 붙이기
			int c = sc.nextInt();
			int r = sc.nextInt();
			
			for(int i = r; i < r + 10; i++ ) {
				for(int j = c; j < c + 10; j++) {
					if(map[i][j] == 1) continue;	//겹치는 부분 패스
					map[i][j] = 1;
				}
			}
		}
		
		int sum = 0;	//검은 영역의 넓이 계산
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map.length; j++) {
				sum += map[i][j];
			}
		}
		
		System.out.println(sum);
		
		
	}

}
