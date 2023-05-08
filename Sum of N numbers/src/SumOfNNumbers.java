import java.util.Scanner;
public class SumOfNNumbers {
	public static void main(String args[])
	{
		System.out.println("enter the number of numbers");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int a;
		System.out.println("enter the numbers");
		for(int i=0;i<n;i++)
		{
			 a=sc.nextInt();
			 sum=sum+a;
			
		}
		System.out.println("The sum is "+sum);
	}

}
