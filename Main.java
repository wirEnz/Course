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
		
		// Nesting example 
		/*
		int age, height, weight;
		
		System.out.println("Enter your age");
		age = scanner.nextInt();
		
		
		if (age >= 10) {
			System.out.println("Enter your height in CM: ");
			height = scanner.nextInt();
			
			System.out.println("enter your weight");
			weight = scanner.nextInt();
			
			if (height < 150) {
				System.out.println("You are too short for this ride sorry...");
			}else if(height > 200) {
				System.out.println("you are too tall for this ride sorry...");
			}else if (weight < 200) {
				System.out.println("Welcome abored Captine!");
			}else {
				System.out.println("Your too heavy for this ride");
			}
			
		}else{
				System.out.println("sorry you are too young for this ride");
		}
		*/	
		
		// switch example
		/*
		int monthNum;
		String monthText = "";
		
		System.out.println("Please enter the number of the Month you want: ");
		monthNum = scanner.nextInt();
		
		switch(monthNum) {
			case 1:{
				monthText = "January";
				break;
			}
			case 2:{
				monthText = "Febuary";
				break;
			}
			case 3:{
				monthText = "March";
			break;
			}
			case 4:{
				monthText = "April";
				break;
			}
			case 5:{
				monthText = "May";
				break;
			}
			case 6:{
				monthText = "June";
				break;
			}
			case 7:{
				monthText = "July";
				break;
			}
			case 8:{
				monthText = "August";
				break;
			}
			case 9:{
				monthText = "September";
				break;
			}
			case 10:{
				monthText = "October";
				break;
			}
			case 11:{
				monthText = "November";
				break;
			}
			case 12:{
				monthText = "decemeber";
				break;
			}
			default: {
				System.out.println("There are only 12 Months in a year...");
			}
		
		}
		
		// != if the input is = not equal null(nothing)  and the text is empty "" (which it is set as empty "" change it to the oposite, which is the month)
		if (monthText != null && !monthText.isEmpty()) {
			System.out.println("The Month is " + monthText);
		}
		*/
		
		// Switch odd or evan
		/*
		int num;
		System.out.println("Please enter a number: ");
		num = scanner.nextInt();
		
		switch(num % 2) {
			case 0: {
			System.out.println("Your number is even");
			break;
			}
			case 1: {
			System.out.println("Your number is odd");
			break;
			}
		}
		*/
		// Switch number to day of the week
		/*
		int dayNum = 0;
		String day = "";
		System.out.println("Please enter a day of the week: ");
		day = scanner.next();
		
		switch(day) {
		
			case "Monday": {
				dayNum = 1;
				break;		
			}
			case "Tuesday":{
				dayNum = 2;
				break;
			}
			case "Wednesday": {
				dayNum = 3;
				break;
			}
			case "Thursday": {
				dayNum = 4;
				break;
			}
			case "Friday": {
				dayNum = 5;
				break;
			}
			case "Saturday": {
				dayNum = 6;
				break;
			}
			case "Sunday": {
				dayNum = 7;
				break;
			}
			default: {
				System.out.println("Invalid input...");
				break;
			}
		
		}
		if (dayNum > 0)
			System.out.println("The number of your day is " + dayNum);
		*/
		//while loop
		// only enter a number between 1 - 100 or say thank you
		/*
		int i;
		System.out.println("Please enter a number");
		i = scanner.nextInt();
		if (i > 0) {			
			while (i <= 100 && i > 0) {
			System.out.println(i);
			i++;
			}
		}else {
			System.out.println("thank you");
		}
		*/
		// do while loop
		/*
		int option;
				
		do {
			System.out.println("Select an option between 1 and 5");
			option = scanner.nextInt();
			
			if (option < 1 || option > 5) {
				System.out.println("invalid option");
			}
		}while (option < 1 || option > 5);
		
		System.out.println("you selected option " + option);
		*/
		// for loop
		/*
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		*/
		//for loop with array ( can got foward and backwards)
		/*
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
				
		for(int i = 6; i >= 0; i--) {
            System.out.println(days[i]);
			
		}
		*/
		//Enhanced for loop (cannot go backwards through array)
		/*
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		
		for (String day : days) {
			System.out.println(day);
		}
		*/
		
		int[] test = new int[3];
		
		for (int i = 0; i < test.length; i++) {
			int grade = 0;
			
			do {
				System.out.println("Please enter test score: ");
				grade = scanner.nextInt();
				
				if (grade <= 0 || grade > 100) {
					System.out.println("Invalid grade, please enter again: ");
				} else {
					test[i] = grade;
				}
			
			} while(grade < 0 && grade > 100);
			
		}
		
		System.out.println("Scores\tGrade\tComment");
		
		for (int i = 0; i < test.length; i++) {
			int grade = test[i];
			String gradeText = "";
			String comment = "";
			
			if (grade > 90) {
				gradeText = "A";
				comment = "Excelent";
			}
			else if (grade > 70) {
				gradeText = "B";
				comment = "Good";		
			}
			else if ( grade >= 50) {
				gradeText = "C";
				comment = "Pass";		
			}
			else if (grade < 50) {
				gradeText = "D";
				comment = "Fail";
			}
			System.out.println(grade + "\t" + gradeText + "\t" +  comment);
			
		}
				
		scanner.close();
	}

}

