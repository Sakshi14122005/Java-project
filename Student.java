package saturday;

public class Student {
	String name;
	int rollNo;
	
	static
	{
		System.out.println("I am student of SMBST");
	}
	Student(String n,int r)
	{
		name=n;
		rollNo=r;
	}
	void display()
	{
		System.out.println("Ener a Name:-"+name);
		System.out.println("Ener a rollNo:-"+rollNo);
	}
	public static void main(String[] args)
	{
		Student s=new Student("SAKSHI",01);
		s.display();
		
	}

	

}
