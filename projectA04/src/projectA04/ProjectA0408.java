package projectA04;

public class ProjectA0408 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		
		sum = 0;
		for(int i = 100; i >= 0 ; i--) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		int i;
		int j;
		i=0;
		j=0;
		do {
			i++;
			j=j+i;
		}while(i<100);
		System.out.println(i + " " + j);

	}

}
