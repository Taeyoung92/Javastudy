package projectA05;

public class ProjectA0514 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 0;
		try {
			for(int i=0; i<5; i++) {
				arr[i+1] = i+1 + arr[i];
				System.out.println("arr[" + i + "]" + arr[i]);
			}
		}catch(Exception e) {
			//e.printStackTrace();
			//catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}

		}

	}

