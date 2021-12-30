package projectA04;

import java.util.Scanner;

public class ProjectA0411 {

	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		
		int n = sc.nextInt();
		while(n != -1) {
			sum = sum + n;
			count = count + 1;
			n = sc.nextInt();
		}
		if(count == 0) {
			System.out.println("입력 된 수가 없습니다.");
			
		}else {
			System.out.print("정수의 개수는 " + count + "개이며 평균은" + (double)sum/count + " 입니다.");
		}

	}

}
