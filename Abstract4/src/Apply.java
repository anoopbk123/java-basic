 class Dog extends Animal{
	void animalsound() {
		System.out.println("dog bow bow");
	}
}
class Cat extends Animal{
	void animalsound() {
		System.out.println("cat meow meow");
	}
}

public class Apply  {
	public static void main(String args[]) {
	Dog d=new Dog();
	Cat c=new Cat();
	d.animalsound();
	d.sleep();
	c.animalsound();
	c.sleep();
	

}
}