package projectA10;

class Point3D2 extends Point2 {
	int z;
	
	Point3D2(int x, int y, int z){
		super(x, y); // Point2(int x, int y)를 호출
		super.x = 10;
		super.y = 20;
		this.z = z;
	}

}
