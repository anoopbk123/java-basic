import java.util.Scanner;
public class Function {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter "+2+" numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sum(a,b);
		System.out.println("the aum of "+a+" and "+b+" is "+c);
	}
	static int sum(int n1,int n2) {
		return n1+n2;
	}

}
