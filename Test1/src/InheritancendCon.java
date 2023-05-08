class C{
	C(){
		System.out.println("this is A");
	}
}
class D extends C{
	D(){
		System.out.println("this is B");
	}

}
public class InheritancendCon {
	public static void main(String args[]) {
		D b1=new D();
	}

}
