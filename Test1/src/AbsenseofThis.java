class Oprations{
	int a,b;
	Oprations(int a,int b){
		}
		void sum() {
			int s=a+b;
			System.out.println("the sum is"+s);
		}
		void subs() {
			int sub=a-b;
			System.out.println("the difference is"+sub);
		}
		
	}

public class AbsenseofThis {
	public static void main(String args[]) {
		Oprations a1=new Oprations(3,8);
		a1.sum();
		a1.subs();
	}

}

