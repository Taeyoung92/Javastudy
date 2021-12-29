package projectA03;

import java.util.Scanner;

public class ProjectA0307 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int median = a;
		if((a >= b && a <= c) || (a >= c && a <= b)) {
			median = a;
		}else if((b >= a && b <= c) || (b >=c && b <=a)) {
			median = b;
		}else {
			median = c;
		}
		
		System.out.println("중간 값은 " + median);
		sc.close();

	}

}
