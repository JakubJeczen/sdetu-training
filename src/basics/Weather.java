package basics;

public class Weather {
	
	public static void main(String[] args){
		
		int temperature = 70;
		String sunCondition = "Sunny";
		
		if (temperature > 80) {
			System.out.println("It's pleasant. Wear a t-shirt.");
		}
		else if ((temperature > 60) && (sunCondition == "Sunny")){
			System.out.println("It's a little cooler. Wear a long-sleeve.");
			System.out.println("Wear sun glasses.");
		}
		else {
			System.out.println("It's a cold day. Bring a sweater.");
		}
		
	}

}
