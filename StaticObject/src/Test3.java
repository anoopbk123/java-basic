
public class Test3 {
	static int a=10;
	int b;
	public static void main(String args[])
	{
		System.out.println(a);
		Hello();
		Test3 t4=new Test3();
		t4.h1();
		t4.b=9;
		System.out.println(t4.b);
		t4.Hello();
		t4.a=5;
		Test3 t5=new Test3();
		t5.a=6;
		System.out.println(t4.a);
		System.out.println(t5.a);
	}
	static void Hello()
	{
		System.out.println("Hello");
	}
	void h1()
	{
		System.out.println("h1");
	}

}
