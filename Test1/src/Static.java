
public class Static {
	static int a=10;
	public static void main(String args[]) {
		System.out.println(a);
		Static s1=new Static();
		Static s2=new Static();
		s1.a=100;
		s2.a=150;
		System.out.println(s1.a);
	}

}
