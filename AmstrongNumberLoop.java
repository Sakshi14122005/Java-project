package Loop;

public class AmstrongNumberLoop {
	public static void main(String[] args)
	{
		int num=370;
		int i=0;
		int j;
		while(num>0)
		{
			j=num%10;
			i=i+j*j*j;
			num=num/10;
		}
		System.out.println(i);
	}
}
