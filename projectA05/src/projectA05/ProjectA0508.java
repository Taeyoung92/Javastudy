package projectA05;

import java.util.Scanner;

public class ProjectA0508 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int sum = 0;
		
		System.out.print(arr.length + "개의 정수를 입력하세요 >>");
		for(int i = 0; i <arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i <arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("평균은 " + (double)sum/arr.length);
		sc.close();
		

	}

}
