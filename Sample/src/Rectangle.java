class Area {
	int length;
	int width;
	void insert(int l,int w) {
		length=l;
		width=w;
		
	}
	void Area() {
		System.out.println(length*width);
	}

}
public class Rectangle{
	public static void main(String args[]) {
	Area r1=new Area();
	Area r2=new Area();
	r1.insert(10,5);
	r2.insert(6, 7);
	r1.Area();
	r2.Area();
}
}