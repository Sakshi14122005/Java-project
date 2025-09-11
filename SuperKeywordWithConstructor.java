package code;

class Teacher {
    String TeacherName;
    String TeacherSubName;

    Teacher() {
        System.out.println("I am default Constructor");
    }

    Teacher(String teacherName) {
        this("Thakrey Sir", "JAVA"); 
        TeacherName = teacherName;
        System.out.println(TeacherName);
    }

    Teacher(String teacherName, String teacherSubName) {
        TeacherName = teacherName;
        TeacherSubName = teacherSubName;
        System.out.println(TeacherName);
        System.out.println(TeacherSubName);
    }
}

class Student1 extends Teacher {
    int StudRoll;
    String StudentName;

    Student1() {
        super("Mande sir"); 
    }

    Student1(int studRoll, String studentName) {
        StudRoll = studRoll;
        StudentName = studentName;
        System.out.println(StudRoll + " and " + StudentName);
    }
}

public class SuperKeywordWithConstructor {
    public static void main(String[] args) {
        Student1 s1 = new Student1();  
    }
}
