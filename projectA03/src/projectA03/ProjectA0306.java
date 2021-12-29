package projectA03;

import java.util.Scanner;

public class ProjectA0306 {
	final static int 오만원 = 50000;
	final static int 만원 = 10000;
	final static int 오천원 = 5000;
	final static int 천원 = 1000;
	final static int 오백원 = 500;
	final static int 백원 = 100;
	final static int 오십원 = 50;
	final static int 십원 = 10;
	final static int 일원 = 1;

	public static void main(String[] args) {
		int res, money;
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하세요>>");
		money = sc.nextInt();
		
		res = money/오만원;//오만원권 개수 계산
		money = money%오만원;//
		if(res>0) {
			System.out.print("오만원권 " + res + "매, ");
		}
		res = money/만원;
		money = money%만원;
		if(res>0) {
			System.out.print("만원권 " + res + "매, ");
		}
		res = money/오천원;
		money = money%오천원;
		if(res>0) {
			System.out.print("오천원권 " + res + "매, ");
		}
		res = money/천원;
		money = money%천원;
		if(res>0) {
			System.out.print("천원권 " + res + "매, ");
		}
		res = money/오백원;
		money = money%오백원;
		if(res>0) {
			System.out.print("오백원권 " + res + "매, ");
		}
		res = money/백원;
		money = money%백원;
		if(res>0) {
			System.out.print("백원권 " + res + "매, ");
		}
		res = money/오십원;
		money = money%오십원;
		if(res>0) {
			System.out.print("오십원권 " + res + "매, ");
		}
		res = money/십원;
		money = money%십원;
		if(res>0) {
			System.out.print("십원권 " + res + "매, ");
		}
		res = money/일원;
		money = money%일원;
		if(res>0) {
			System.out.print("일원권 " + res + "매입니다.");
		}
		
		

	}

}
