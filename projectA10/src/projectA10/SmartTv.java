package projectA10;

class SmartTv extends Tv{ //CaptionTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
	boolean caption;      // 캡션상태(on/off)
	void displayCaption(String text) {
		if(caption) {     // 캡션 상태가 on(true)일 때만 text를 보여준다.
		System.out.println(text);	
		}
	}
}