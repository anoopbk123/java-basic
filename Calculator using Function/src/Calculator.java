import java.util.Scanner;
public class Calculator {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		System.out.println("select one operation\n"
				+ "1)sum\n"
				+ "2)substraction\n"
				+ "3)multiplication\n"
				+ "4)division");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			sum(a,b);
			break;
		case 2:
			sub(a,b);
			break;
		case 3:
			multi(a,b);
			break;
		case 4:
			division(a,b);
			break;
		}
	}
	static void sum(float n1,float n2)
	{
		System.out.println(n1+n2);
	}
	static void sub(float n1,float n2)
	{
		System.out.println(n1-n2);
	}
	static void multi(float n1,float n2)
	{
		System.out.println(n1+n2);
	}
	static void division(float n1,float n2)
	{
		System.out.println(n1+n2);
	}

}
