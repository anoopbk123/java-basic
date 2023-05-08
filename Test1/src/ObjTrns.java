class I{
	void display() {
		System.out.println("hello");
	}
}
class J{
	void print(I obj) {
		obj.display();
	}
}
public class ObjTrns {
	public static void main(String args[]) {
		I obj=new I();
		J s1=new J();
		s1.print(obj);
	}

}
