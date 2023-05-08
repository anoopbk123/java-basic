import java.util.Scanner;
import java.io.*;
public class LargestNumber {
	
		public static void main(String args[])
		{
			System.out.println("enter the two numbers");
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			int b=s.nextInt();
			if(a>b)
			{
				System.out.println("the largest number is "+a);
			}
			else
			{
				System.out.println("the largest number is "+b);
			}
			
			
		}
	

}
