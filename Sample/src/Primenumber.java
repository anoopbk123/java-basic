import java.util.Scanner;
public class Primenumber {
	public static void main(String args[]) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int flaag=1;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flaag=0;
				break;
			}
		}
		if(flaag==0) {
			System.out.println("it is not a prime number");
			
		}
		if(flaag==1) {
			System.out.println("it is a prime number");
		}
	}

}
