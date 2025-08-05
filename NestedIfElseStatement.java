package statement;

public class NestedIfElseStatement {
    public static void main(String[] args) 
    {
        String uid = "manju12";
        String pwd = "M26@#$";

        if (uid.equals("manju12"))
        {
            if (pwd.equals("M26@#$"))
            {
                System.out.println("Login successfully");
            } else
            {
                System.out.println("Password is wrong");
            }
        } 
        else
        {
            System.out.println("Username is wrong");
        }
    }
}
