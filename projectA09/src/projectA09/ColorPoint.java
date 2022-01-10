package projectA09;

public class ColorPoint extends Point {
	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(this.color);
		showPoint();
	}

}
