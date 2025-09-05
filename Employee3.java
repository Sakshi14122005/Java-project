package Demo;

public class Employee3 {

	    private int empId;
	    private String empName;
	    private String empDesignation;
	    private double empSal;

	    public Employee3(int empId, String empName, String empDesignation, double empSal) {
	        this.empId = empId;
	        this.empName = empName;
	        this.empDesignation = empDesignation;
	        this.empSal = empSal;
	    }

	    @Override
	    public String toString() {
	        return "Employee{" +
	                "empId=" + empId +
	                ", empName='" + empName + '\'' +
	                ", empDesignation='" + empDesignation + '\'' +
	                ", empSal=" + empSal +
	                '}';
	    }

	    public static void main(String[] args) {
	        Employee3 employee1 = new Employee3(101, "John Doe", "Manager", 50000.0);
	        Employee3 employee2 = new Employee3(102, "Jane Smith", "Developer", 45000.0);

	        System.out.println(employee1);
	        System.out.println(employee2);
	    }
	}


