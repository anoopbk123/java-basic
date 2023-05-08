import java.util.Scanner;
public class StringLengthFounder {
public static void main(String args[])
{
	System.out.println("enter the string");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int n=str.length();
	System.out.println("The length of the string is "+n);
}
}
