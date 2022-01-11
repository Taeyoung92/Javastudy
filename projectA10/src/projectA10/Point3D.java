package projectA10;

class Point3D extends Point {
	int z;
	
	String getLocation() { //오버라이딩
		// 	return "x : " + x + ", y :" + y + ", z :" + z;
		return super.getLoacation() + ", z :" + z; // 조상의 메서드 호출
	}
}
