package Loop;

public class PrimeNumberLoops 
{
    public static void main(String[] args)
    {
        int num = 7;
        int a = 0;

        for (int i = 2; i < num; i++)
        {
            if (num % i == 0) {
                a = a + 1;
            }
        }

        if (a == 0)
        {
            System.out.println("Prime number is: " + num);
        }
        else
        {
            System.out.println("Not a prime number: " + num);
        }
    }
}
