import java.util.*;
class Sample3{
	int a,b,c;
	void sum() {
		c=a+b;
	}
	void display() {
		System.out.println("the sum is "+c);
	}
}
public class Object2 {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	Sample3 obj1=new Sample3();
	Sample3 obj2=new Sample3();
	System.out.println("enter two numbrs");
	obj1.a=sc.nextInt();
	obj1.b=sc.nextInt();
	obj1.sum();
	obj1.display();
	System.out.println("enter two numbrs");
	obj2.a=sc.nextInt();
	obj2.b=sc.nextInt();
	obj2.sum();
	obj2.display();
}
}
