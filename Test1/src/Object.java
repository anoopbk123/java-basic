class Sample{
	int a,b;
	void display() {
		System.out.println(a+" "+b);
	}
}
public class Object {
	public static void main(String args[]) {
		Sample s1=new Sample();
		Sample s2=new Sample();
		s1.a=10;
		s2.a=12;
		s2.b=13;
		s1.display();
		s2.display();
	}

}
