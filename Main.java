import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// GST Calculator
		/*
		System.out.println("Please enter price: ");
		double price = scanner.nextDouble();
		double tax = price * 0.15;
				
		System.out.println("GST is: " + tax);
	
		scanner.close();
		*/
		
		// Fahrenheit to Celsius Calculator
		/*
		double fahrenheit, celsius;
		System.out.println("Enter temperature to convert: ");
		fahrenheit = scanner.nextDouble();
		
		celsius = (fahrenheit - 32) * 5.00 / 9.00;
		
		System.out.println("Temperature in celsius is: " + celsius);
		*/
		
		// Celsius to Fahrenheit Calculator
		/*
		double fahrenheit, celsius;
		System.out.println("Please enter Celsius: ");
		celsius = scanner.nextDouble();
		
		fahrenheit = (celsius * 9.0 / 5.0) + 32;
		
		System.out.println("Temperature in Fahrenheit is :" + fahrenheit);
		*/
		
		// If statements
		
		/*
		System.out.println("Please enter a number");
		int num = scanner.nextInt();
		System.out.println("Please enter a second number");
		int num2 = scanner.nextInt();
		
		
		if (num > num2)
		{
			System.out.println(num + " is larger than " + num2);
		}else {
			System.out.println(num + " is less than " + num2);
		}
		*/
		
		// odd or evan number
		/*
		System.out.println("Please enter a number");
		int num = scanner.nextInt();
		
		if (num % 2 == 0)
		{
			System.out.println("Your number is evan");
		}else {
			System.out.println("Your number is odd");
		}
		*/
		
		// name to0 long or too short
		/*
		String name;
		System.out.println("Please enter your name");
		name = scanner.next();
		
		if (name.length() > 20) {
			System.out.println("To many characters");
		}else if (name.length() < 3){
			System.out.println("You name is to short");
		}else{
			System.out.println("Your name is " + name);
		}
		*/
		
		// Highest number
		/*
		int firstNum, secondNum, thirdNum;
		
		System.out.println("Please enter a number ");
		firstNum = scanner.nextInt();
		
		System.out.println("Please enter a second number ");
		secondNum = scanner.nextInt();
		
		System.out.println("Please enter a third number ");
		thirdNum = scanner.nextInt();
		
		if (firstNum > secondNum && firstNum > thirdNum) {
			System.out.println("The highest number is " + firstNum);
		} else if (secondNum > firstNum && secondNum > thirdNum) {
			System.out.println("The highest number is " + secondNum);
		} else if (thirdNum > firstNum && thirdNum > secondNum) {
			System.out.println("The highest number is " + thirdNum);
		} else {
			System.out.println("Two or more numbers are the same");
		}
		*/
		
		
					
		scanner.close();
		
		
	}

}

