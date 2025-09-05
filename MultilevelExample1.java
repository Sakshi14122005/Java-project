package Demo;
import java.util.Scanner;

class Continent {
    String continent;

    Continent(String continent) {
        this.continent = continent;
    }
}

class Country extends Continent {
    String country;

    Country(String continent, String country) {
        super(continent);
        this.country = country;
    }
}

class State extends Country {
    String state;

    State(String continent, String country, String state) {
        super(continent, country);
        this.state = state;
    }

    void displayDetails() {
        System.out.println("\n--- Location Details ---");
        System.out.println("Continent : " + continent);
        System.out.println("Country   : " + country);
        System.out.println("State     : " + state);
    }
}

public class MultilevelExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Continent Name: ");
        String c1 = sc.nextLine();

        System.out.print("Enter Country Name: ");
        String c2 = sc.nextLine();

        System.out.print("Enter State Name: ");
        String c3 = sc.nextLine();

        State s = new State(c1, c2, c3);
        s.displayDetails();

        sc.close();
    }
}