
public class Super {
public static void main(String args[]) {
	B a=new B();
	a.display();
	a.sum();
	
}
}
class A {
	int a=10;
	void display() {
		System.out.println("this is A");
	}
}
class B extends A{
	int a=11;
	void display() {
		System.out.println("This is B");
		super.display();
	
	}
	void sum(){
		int c=a+super.a;
		System.out.println(c);
		
	}
	
}
