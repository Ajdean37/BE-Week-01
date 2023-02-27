
public class Labs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int seatsAvailable = 60;
		double groceryCost = 75.89;
		char middleInitial = 'G';
		boolean isHotOutside = true;
		String firstName = "Makensie";
		String streetAddress = "1234 1st Ave";
		
		System.out.println("There are" + " " + seatsAvailable + " " + "seats available.");
		System.out.println(groceryCost);
		System.out.println(middleInitial);
		System.out.println(isHotOutside);
		System.out.println(firstName);
		System.out.println(seatsAvailable);
		
		seatsAvailable = seatsAvailable - 2;
		//OR
		seatsAvailable -=2;
		System.out.println(seatsAvailable);
		
		groceryCost += 2.15;
		System.out.println(groceryCost);
		
		middleInitial = 'T';
		System.out.println(middleInitial);
		
		isHotOutside = false;
		System.out.println(isHotOutside);
		
		String fullName = firstName + " " + middleInitial + " " + "Dean";
		System.out.println(fullName);
		
		System.out.println("Hello" + " " + fullName + " " + "who lives at" + " " + streetAddress);
		
		
	}

}


