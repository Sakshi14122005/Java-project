package Codechef;

class Address
{
private int laneno;
private int houseno;
private String area;
Address(int laneno, int houseno, String area)   
{
this.laneno=laneno;
this.houseno=houseno;
this.area=area;
}
public String toString()
{
return this.laneno+" " +this.houseno+" " +this.area+" ";
}
}


class Student 
{
private int rollno;
private String name;
private Address add;  
Student(int rollno, String name, Address add)
{
this.rollno=rollno;
this.name=name;
this.add=add;
}
public String toString()    
{
return this.rollno+" " + this.name+" " + add.toString();    
}
public Object Clone()  throws CloneNotSupportedException
{
return super.clone();
}
}


class Demo 
{
public static void main(String args[])  throws CloneNotSupportedException 
{
Address address1=new Address(5,12,"Sangamner");
Student s1=new Student(10,"Sakshi",address1);  
System.out.println(s1); 
{
Student s2=(Student)s1.Clone();    
System.out.println(s2);     
}
}
}

