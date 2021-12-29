package projectA03;

import java.util.Scanner;

public class ProjectA0304 {

	public static void main(String[] args) {
		final double rate = 1200.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("원화를 입력하세요(단위 : 원)>>");
		int won = sc.nextInt();
		double dollar = won/rate;
		System.out.println(won + "원은 " + dollar + " 달러입니다.");
		sc.close();
	}

}
