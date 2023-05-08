import java.util.*;
public class PrimeNumber {
	public static void main(String args[]) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int flaag=1;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				flaag=0;
				break;
			}
		}
		if(flaag==1)
		{
			System.out.println("the number is a prime number");
		}
		else {
			System.out.println("the number is not a prime number");
		}
	}

}
