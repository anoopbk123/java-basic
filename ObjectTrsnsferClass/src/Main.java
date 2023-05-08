
public class Main {
	public static void main(String args[]) {
		B p=new B();
		A a=new A();
		a.display(p);
	}

}
class A{
	void display(B p) {
		p.display();
	}
}
class B{
	void display() {
		System.out.println("hello");
	}
}
