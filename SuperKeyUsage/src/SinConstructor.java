
public class SinConstructor {
	public static void main(String args[]) {
		B1 c=new B1();
		B1 d=new B1(10);
	}

}
class A1{
	A1(){
		System.out.println("it is A constructor");
		
	}
	A1(int a){
		System.out.println("A argument");
	}
}
class B1 extends A1{
	B1(){
		System.out.println("it is B constructor");
		
	}
	B1(int a){
	super(a);
		System.out.println("B argument");
	}
}

