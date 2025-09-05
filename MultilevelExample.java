package Demo;

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

	public class MultilevelExample {
	    public static void main(String[] args) {
	        State s = new State("Asia", "India", "Maharashtra");
	        s.displayDetails();
	    }
	}


