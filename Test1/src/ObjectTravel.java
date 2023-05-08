class Final{
	void displayfinal() {
		System.out.println("hello");
	}
}
class Display{
	void display() {
		Final f1=new Final();
		f1.displayfinal();
	}
}
public class ObjectTravel {
	public static void main(String args[]) {
		Display d1=new Display();
		d1.display();
	}

}
