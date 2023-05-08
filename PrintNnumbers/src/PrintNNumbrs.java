import java.util.Scanner;
public class PrintNNumbrs {
	public static void main(String args[])
	{
		System.out.println("Enter the limit");
		Scanner s=new Scanner(System.in);
		int limit=s.nextInt();
		int i;
		for(i=0;i<=limit;i++)
		{
			System.out.println("  "+i);
		}
				
	}

}
