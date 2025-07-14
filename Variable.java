package Demo;

public class Variable {
	
	int a = 50;  //global variable/instence variable;
	static int b = 50;
	
	public static void main(String[] args)
	{
		int b = 50;  //local variable / temporary variable
		System.out.println(b);
	}
	
	void Add()
	{
		int b = 70;
	}
}

