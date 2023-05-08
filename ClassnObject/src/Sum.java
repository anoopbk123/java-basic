import java.util.Scanner;
public class Sum {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Samble1 s11=new Samble1();
		Samble1 s22=new Samble1();
		System.out.println("enter two numbers");
		s11.a=sc.nextInt();
		s11.b=sc.nextInt();
		s11.sum();
		s11.display2();
		
	}

}
