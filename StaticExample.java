package bank;

public class StaticExample {
	int StudId;
	String StudName;
	
	void Init(int a, String b)
	{
		StudId=a;
		StudName=b;
	}
	void print()
	{
		System.out.println("StudId :"+StudId+"\n StudName:"+StudName);
		
	}
	StaticExample()
	{

	}
	public static void main(String[] args)
	{
		StaticExample s1=new StaticExample();
		s1.Init(2, "Ram");
	    s1.print();
		
	}
	}


