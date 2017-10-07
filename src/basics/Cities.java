package basics;

public class Cities {

	public static void main(String[] args) {
		//Declare and define a n array
		String[] cities = {"Warszawa","Gdansk","Krakow","Wroclaw"};
		//System.out.println(cities[0]);
		//System.out.println(cities[1]);
		
		
		//Declare & define the array (only size)
		String[] states = new String[5];
		states[0] = "UK";
		states[1] = "Germany";
		states[2] = "Poland";
		states[3] = "Greece";
		states[4] = "Portugal";
		int i = 0;
		
		//Do Loop:
		do {
		System.out.println( "COUNTRY: " + states[i]);
		i += 1;
		} while (i<5); 
		
		//While Loop:
		int n = 0;
		boolean stateFound = false;
		while (stateFound == false) {
			String country = states[n];
			System.out.println(states[n]);
			if (country == "Greece") {
				System.out.println("Greece has been found at position no " + n);
				stateFound = true;
			}
			n++;
		}
		
		String[] continents;
		continents = new String[3];
		
		continents[0] = "North America";
		continents[1] = "Europe";
		continents[2] = "Asia";		
		
		//For Loop:
		
		for (int x = 0; x < 3; x++){
			System.out.println(continents[x]);
		}
	}
}
