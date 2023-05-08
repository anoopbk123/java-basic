import java.util.Scanner;
public class Palindrom {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int m=sc.nextInt();
		int n=m;
		int n2=0;
		do {
			int t=n%10;
			n2=n2*10+t;
			n=n/10;
		}while(n>0);
		
	if(n2==m) {
		System.out.println("it is a palindrom");
	}
		else{
			System.out.println("it is not a palindrome");
		}
		
	}
}
