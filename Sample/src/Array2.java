import java.io.*;
import java.util.Scanner;
public class Array2 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array size");
	int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("enter the array values");
    for(int i=0;i<n;i++) {
    	a[i]=sc.nextInt();
    }
    System.out.println("the array you entered\n");
    for(int i=0;i<n;i++) {
    	System.out.println(a[i]+"\n");
    }
}
}
