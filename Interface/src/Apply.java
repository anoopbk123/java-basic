class Dog implements Animal{
	public void animalsound() {
		System.out.println("Dog sound bow bow");
	}
	public void sleep() {
		System.out.println("ZZZzzz");
	}
}
public class Apply {
	public static void main(String a[]) {
		Dog d=new Dog();
		d.animalsound();
		d.sleep();
	}
	

}
