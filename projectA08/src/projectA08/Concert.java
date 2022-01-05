package projectA08;

import java.util.Scanner;

class Concert {
	private String hallName;
	private Group[] group = new Group[3];
	private Scanner sc = new Scanner(System.in);
	
	public Concert(String hallname) {
		this.hallName = hallName;
		group[0] = new Group('S', 10); // S타입 좌석 생성
		group[1] = new Group('A', 10); // A타입 좌석 생성
		group[2] = new Group('B', 10); // B타입 좌석 생성
	}
	
	private void reserve() {
		System.out.print("좌석 구분 S(1), A(2), B(3) >>");
		int type = sc.nextInt();
		if(type<1 || type>3) {
			System.out.println("잘못 된 좌석타입입니다.");
			return;
		}
		group[type-1].reserve();
	}
	private void search() {
		for(int i=0; i<group.length; i++) {
			group[i].show();
		}
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	
	private void cancel() {
		System.out.println("좌석 S:1, A:2, B:3>>");
		int type = sc.nextInt();
		if(type<1 || type>3) {
			System.out.println("잘못 된 좌석타입입니다.");
			return;
		}
		group[type-1].cancel();
	}
	
	public void run() {
		System.out.println(hallName + "예약 시스템입니다.");
		int choice = 0;
		while(choice != 4) {
			System.out.println("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
			choice = sc.nextInt();
			switch(choice) {
			case 1://예약
				reserve();
				break;
			case 2://조회
				search();
				break;
			case 3://취소
				cancel();
				break;
			case 4://끝내기
				break;
			default:
				System.out.println("잘못 입력하였습니다.");
			}
		}
	}

}
