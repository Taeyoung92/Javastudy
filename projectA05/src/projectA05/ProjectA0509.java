package projectA05;

public class ProjectA0509 {
	enum Week {월, 화, 수, 목, 금, 토, 일};

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		for(int k : arr) {
			sum = sum + k;
		}
		System.out.println("합은 : " + sum);
		
		String[] names = {"사과","배","바나나","체리","포도","망고스틴"};
		for(String s: names) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		for(Week day: Week.values()) {
			System.out.print(day + "요일 ");
		}

	}
	
}
