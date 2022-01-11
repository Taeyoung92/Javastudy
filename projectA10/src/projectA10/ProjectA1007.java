package projectA10;

public class ProjectA1007 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; // car = (Car)fe;에서 형변환이 생략됨
		//car.water();
		fe2 = (FireEngine)car; //자손타입 <- 조상타입. 형변환 생략 불가
		fe2.water();

	}

}
