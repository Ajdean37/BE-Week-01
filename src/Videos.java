public class Videos {
	
	public static void main(String[] args) {
		
		/* Types of Variables
		 * PRIMITIVE
		 * int- integer
		 * double- decimal 
		 * float- precision decimal
		 * long- like int, numbers can be higher
		 * short- like int, less of number range
		 * char- single character
		 * boolean- true or false
		 * 
		 * OBJECTS
		 * String- is textual data, string of characters
		 */
		
		// variable declaration- type, identifier, assignment operator, value, semicolon
		
		int amandasAge = 33;
		double accountBalance = 34.67;
		char middleInitial = 'J';
		boolean isHotOutside = false;
		String firstName = "Amanda";
		
		System.out.println(amandasAge);
		System.out.println(accountBalance);
		System.out.println(middleInitial);
		System.out.println(isHotOutside);
		System.out.println(firstName);
		
		//operator performs actions on operands
		 // + - * /
		
		int age = 34;
		System.out.println(age);
		boolean isAge30 = age == 30;
		System.out.println(isAge30);
		
		System.out.println(age == 34);
		
		age = age + 1;
		System.out.println(age);
		
		String lastName = "Dean";
		String fullName = firstName + " " + lastName; //concatenation
		System.out.println(fullName);
		
		System.out.println("The balance in your account is $" + accountBalance);
		
		double depositAmount = 25.54;
		double newAccountBalance;
		double withdrawalAmount = 12.76;
		
		newAccountBalance = accountBalance + depositAmount;
		System.out.println("You have deposited $" + depositAmount);
		System.out.println("Your new balance is $" + newAccountBalance);
		
		newAccountBalance = newAccountBalance - withdrawalAmount;
		System.out.println("Here is your withdrawal of $" + withdrawalAmount);
		System.out.println("Your new balance is $" + newAccountBalance);



	}
}



