package ApplySum;
import java.util.Scanner;
import Addition.Sum;

public class Apply {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	Sum s=new Sum(a,b);
}
}
