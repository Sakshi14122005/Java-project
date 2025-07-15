package Web;

class Demo 
{
    void insert(int a, int b) 
    {
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
        System.out.println("Multiplication: " + prod);

        if (b != 0) 
        {
            int div = a / b;
            System.out.println("Division: " + div);
        } else 
        {
            System.out.println("Division: Cannot divide by zero.");
        }
    }
}

public class Cpp 
{
    public static void main(String[] args)
    {
        Demo d1 = new Demo();
        d1.insert(10, 5); 
    }
}
