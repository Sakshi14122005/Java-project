package com.inheritance;
//This keyword with Variable....
//where we use this keyword.
//1) we use this keyword in java to,,,
//Resolve Variable Ambiguity (confusion) between local variable and 
//global variable when both the local variable and global variable has same name.
//It refers current class global/instance variable.
class PQR{
	int Id;
	String Name;
	   PQR(int Id, String Name)
	   {
		this.Id = Id;
		this.Name = Name;
		System.out.println(Id);
		System.out.println(Name);
	   }
}
public class ThisWithVariable {
	public static void main(String[] args) {
		PQR p1 = new PQR(1,"Sham");
	}
}


