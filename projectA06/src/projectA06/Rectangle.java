package projectA06;

import java.util.Scanner;

public class Rectangle {
	
	int width;
	int height;
	
	public int getArea() {
		return width * height;
	}

	public static void main(String[] args) {
		Rectangle rct = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		
		rct.width = sc.nextInt();
		rct.height = sc.nextInt();
		
		System.out.println("사각형의 면적은 " + rct.getArea());
		sc.close();
		

	}

}
