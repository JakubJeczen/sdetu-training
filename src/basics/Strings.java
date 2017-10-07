package basics;

public class Strings {
	
	public static void main(String[] args)
	{
		String bookTitle = "Lord of the Rings";
		String checkWord = "Kuba";
		String browser = "chrome";
		
		if (bookTitle.contains(checkWord)) {
			System.out.println("String " + bookTitle + " contains word " + checkWord);}
		else { 
				System.out.println("String " + bookTitle + " does not contain word " + checkWord);
			}
		
		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Browser is chrome");
		}
		
		String firstName = "Jakub";
		String lastName = "Jeczen";
		String birthDate ="04.04.1986";
		
		System.out.print(firstName.substring(0,1) + lastName.substring(0,5) + birthDate.substring(6));
		System.out.println("\nTotal length of the strings is " + CalcLength(firstName,lastName,birthDate));
		}
	
	static int CalcLength(String fName, String lName, String bDate){
		
		int length = fName.length() + lName.length() + 8;
		return length;
	}
	}


