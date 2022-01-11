package projectA10;

class Tv {
	boolean power; // 전원상태(on/off)
	int channel;   // 채널
	
	void power() {
		power =! power;
	}
	void channerUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

public class ProjectA1001 {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;				//조상 클래스로부터 상속받은 멤버
		stv.channerUp();				//조상 클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true; // 캡션(자막) 기능을 켠다.
		stv.displayCaption("Hello, World");
		
	}
}