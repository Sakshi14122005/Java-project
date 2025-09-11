package code;

class Car {
    String carName = "I am a Car";
}

class Bolero1 extends Car {
    String carName = "I am Bolero";

    void display() {
        System.out.println(this.carName);   
        System.out.println(super.carName);  
    }
}

public class SuperWithVariable {
    public static void main(String[] args) {
        Bolero1 b1 = new Bolero1();  
        b1.display();
    }
}
