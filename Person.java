package Product;

public class Person {
	String name;
	int age;
	Person(String n,int a)
	{
		name=n;
		age=a;
	}
void display()
{
	System.out.println("Name:-" +name);
	System.out.println("Age:-" +age);
}
	 public static void main(String[] args) 
	 {
		 Person p1 = new Person("Sakshi", 41);
	        Person p2 = new Person("Sakshi", 40);

	        p1.display();
	        p2.display();
}
}
