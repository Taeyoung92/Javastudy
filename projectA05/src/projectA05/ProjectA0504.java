package projectA05;

import java.util.Scanner;

public class ProjectA0504 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan;
		int count;
		
		
		for(dan = sc.nextInt(); dan < 10; dan++) {
			for(count = 1; count < 10; count++) {
				System.out.println(dan + " x " + count + " = " + dan*count);
		}
		System.out.println();
	}
	}
}