
public class Name extends ID {
String name;
void display()
{
	System.out.println(id+" "+name);
}
public static void main(String args[])
{
	Name s1=new Name();
	s1.id=1;
	s1.name="Abhijith";
	s1.display();
}
}
