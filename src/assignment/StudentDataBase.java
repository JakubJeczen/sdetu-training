package assignment;

public class StudentDataBase {
	
	public static void main(String[] args) {
		
		Student student = new Student("Sandra","Pietrulewicz","87090301233");
		student.setState("pomorskie");
		student.setPhone("6821816");
		student.pay();
		student.enroll();
		System.out.println(student.toString());
		System.out.println("Telefon : " + student.getPhone());
	}
}
	
	 class Student {
		
		private String name;
		private String surname;
		private String phone;
		private String city;
		private String paymentStatus;
		private int pref;
		private String state;
		private static int balance = 0;
		
		//Getters v Setters
		
		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			
			switch(state){
			case "pomorskie" : 
				pref = 58;
				break;
			case "warminsko-mazurskie" :
				pref = 89;
				break;
			case "kujawsko-pomorskie" :
				pref = 56;
				break;
			}
			this.phone = pref + " " + phone;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public String getState() {
			return state;
		}


		public void setState(String state) {
			this.state = state;
		}
		
		public String getPaymentStatus() {
			return paymentStatus;
		}


		public void setPaymentStatus() {

			if (balance != 0 ) {
			this.paymentStatus = "Y";
		}
			else {
			this.paymentStatus = "N";
			}
		}


		private String SSN;
		private String emailID;
		private String userID;
		private static final int ID = 233;
		
		
		//Constructor
		
		public Student(String name, String surname, String SSN){
			
			emailID = name + surname + "@univ.gda.pl";
			//System.out.println(emailID);
			
			String randomElement = String.valueOf(1000 + (int)(Math.random() * 9000)) + String.valueOf(1000 + (int)(Math.random() * 9000)) + String.valueOf(1000 + (int)(Math.random() * 9000)) + String.valueOf(1000 + (int)(Math.random() * 9000)); 
			
			userID = ID + "" + randomElement + SSN.substring(SSN.length() - 4);
			System.out.println("Identyfikator studenta: " + userID);
			
			this.name = name;
			this.surname = surname;
			
			//100 + (int)(Math.random() * 900)
		}
		
		void enroll() {
			
			setPaymentStatus();
			
			if (paymentStatus == "Y") {
				System.out.println("Student enrolled successfully!");
			}
			else {
				System.out.println("Student cannot be enrolled : Please pay admission fee first!");
			}
		}
			
		void pay() {
			balance = 50;
		}
			
	 
		@Override
		public String toString() {
			String wpisowe;
			if (paymentStatus == "Y") {
				wpisowe = "uiszczone";
			}
			else {
				wpisowe = "nie uiszczone";
			}
			return "[Name: " + name + " " + surname + " ]\n[Email: " + emailID + "]\n[Wpisowe: " + wpisowe + "]";
		}
		}
	
	
	


