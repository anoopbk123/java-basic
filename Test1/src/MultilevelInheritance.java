class A{
	int a;
}
class B extends A{
	int b;
}
class Sum2 extends B{
	void sum() {
		System.out.println(a+b);
	}
}
public class MultilevelInheritance {
	public static void main(String args[]) {
		Sum2 s1=new Sum2();
		s1.a=10;
		s1.b=2;
		s1.sum();
	}

}
