package codechef;

	class Employee {
	    int id;
	    String name;
	    static String company = "TechSoft"; 


	    Employee(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    void display() {
	        System.out.println("ID: " + this.id + ", Name: " + this.name + ", Company: " + company);
	    }

	    static void changeCompany(String newCompany) {
	        company = newCompany;
	    }
	}

	public class EmployeeTest {
	    public static void main(String[] args) {

	        Employee e1 = new Employee(101, "Ajun");
	        Employee e2 = new Employee(102, "Sneha");

	        e1.display();
	        e2.display();


	        Employee.changeCompany("NextGen Solutions");


	        e1.display();
	        e2.display();
	    }
	}

