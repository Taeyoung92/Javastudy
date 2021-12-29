package projectA03;

import java.util.Scanner;

public class ProjectA0308 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하시오 >> ");
		int I1 = sc.nextInt();
		int I2 = sc.nextInt();
		int I3 = sc.nextInt();
		
		if((I1+I2) < I3 || (I1+I3) < I2 || (I2+I3) < I1) {
			System.out.println("삼각형을 만들 수 없습니다.");
		}else {
			System.out.println("삼각형이 됩니다.");
		}
		sc.close();

	}

}
