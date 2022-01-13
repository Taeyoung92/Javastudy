package projectA1102;

public class ProjectA1103 {

	public static void main(String[] args) {
		Integer num = new Integer(17); // 박싱
		
		int n = num.intValue(); // 언박싱
		
		System.out.println(n);
		
		
		Character ch = 'X'; // Character ch = new Character('X'); :오토박싱
		
		char c = ch; // char c = ch.charValue(); :오토언박싱
		
		System.out.println(c);
	}

}
