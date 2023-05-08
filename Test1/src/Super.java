class F{
	void display() {
		System.out.println("this is F");
		
	}
}
class H extends F{
	void display(){
	System.out.println("this is H");
	}
	void displayf() {
		super.display();
	}
}

public class Super {
	public static void main(String args[]) {
		H f1=new H();
		f1.display();
		f1.displayf();
	}

}

