package code;
class Cars{     
	int CarNo = 4050;
	int CarSpeed = 50;
	String CarColor ="Red";
	
	void Display()
	{
		System.out.println("Car Color is "+CarColor);
		System.out.println("Car Number is "+CarNo);
		System.out.println("Car Speed is "+CarSpeed +" km/hr");
	}
}
class Bolero extends Cars { 
	void display1()
	{
		System.out.println("I am Bolero");
	}
}
class Fortuner extends Bolero{
	
}

public class Demo1 {
public static void main(String[] args)
{
    Fortuner f1 = new Fortuner();
    f1.Display();
    f1.display1();
    }
}