import java.util.Scanner;
public class ArrayInsertion {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		System.out.println("enter the array elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			 a[i]=sc.nextInt();
		}
		System.out.println("the array elements are");
		for(int j=0;j<n;j++)
		{
			System.out.println(" "+a[j]);
		}
		
	}

}
