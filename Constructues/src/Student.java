
public class Student {
int id;
String name;
Student(int i,String n)
{
	id=i;
	name=n;
}
void display()
{
	System.out.println("id: "+id+" name: "+name);
}
public static void main(String args[])
{
	Student s1=new Student(1,"Abu");
	Student s2=new Student(2,"Babu");
	s1.display();
	s2.display();
	}
}
