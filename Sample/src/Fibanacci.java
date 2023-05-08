import java.util.Scanner;
public class Fibanacci {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int n1=0,n2=1;
		System.out.println(n1+"\n"+n2);
		for(int i=2;i<n;i++) {
			int n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
		}

}
}
