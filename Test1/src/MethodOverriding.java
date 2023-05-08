class E{
	void display() {
		System.out.println("this is E");
		
	}
}
class G extends E{
	void display(){
	System.out.println("this is G");
	}
}

public class MethodOverriding {
	public static void main(String args[]) {
		G f1=new G();
		f1.display();
	}

}
