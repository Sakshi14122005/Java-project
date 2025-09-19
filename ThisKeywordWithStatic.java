package codechef;

	class Student {
	    int rollNo;
	    String name;

	    static String college = "Pune University";

	    
	    Student(int rollNo, String name) {
	        this.rollNo = rollNo;  
	        this.name = name;
	    }

	    void display() {
	        System.out.println(this.rollNo + " " + this.name + " " + college);
	    }
	}

	public class ThisKeywordWithStatic {
	    public static void main(String[] args) {
	        Student s1 = new Student(1, "SMBST");
	        Student s2 = new Student(2, "Loni");

	        s1.display();
	        s2.display();

	        Student.college = "Global College";

	        s1.display();
	        s2.display();
	    }
	}

