package projectA07;
class TV2{
	private String manufacturer;
	private int year;
	private int size;
	public TV2(String manufacturer, int year, int size) {
		this.manufacturer = manufacturer;
		this.year = year;
		this.size = size;
	}
	
	public void show() {
		System.out.print(this.manufacturer + "에서 제작한 ");
		System.out.print(this.year + "년형 ");
		System.out.println(this.size + "인치 TV");
	}
}

public class ProjectA0706 {

	public static void main(String[] args) {
		TV2 tv = new TV2("LG", 2017, 32);
		tv.show();
		

	}

}
