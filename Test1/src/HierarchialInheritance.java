class DM{
	int a,b;
}
class Sum4 extends DM{
	void sum() {
		int sum=a+b;
		System.out.println("the sum is "+sum);
	}
}
class Sub extends DM{
	void difference() {
		int d=a-b;
		System.out.println("the difference is "+d);
	}
}
public class HierarchialInheritance {
	public static void main(String args[]) {
		Sum4 s1=new Sum4();
		s1.a=10;
		s1.b=5;
		Sub s2=new Sub();
		s2.a=10;
		s2.b=5;
		s1.sum();
		s2.difference();
	}

}
