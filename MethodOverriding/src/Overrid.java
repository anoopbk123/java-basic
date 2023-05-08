public class Overrid {
public static void main(String args[]) {
	B a=new B();
	a.display();
}
}
class A {
	void display() {
		System.out.println("this is A");
	}
}
class B extends A{
	void display() {
		System.out.println("This is B");
	}
}
