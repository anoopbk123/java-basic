class Sample5{
	void display() {
		System.out.println("hello");
	}
	void display(int a) {
		System.out.println("hai");
	}
}
public class MethodOvrloading {
	public static void main(String args[]) {
		Sample5 s1=new Sample5();
		s1.display();
		s1.display(9);
	}

}
