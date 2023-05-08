class Operations{
	int a,b;
	Operations(int a,int b){
		this.a=a;
		this.b=b;}
		void sum() {
			int s=a+b;
			System.out.println("the sum is"+s);
		}
		void subs() {
			int sub=a-b;
			System.out.println("the difference is"+sub);
		}
		
	}

public class This {
	public static void main(String args[]) {
		Operations a1=new Operations(3,8);
		a1.sum();
		a1.subs();
	}

}
