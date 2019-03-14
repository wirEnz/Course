import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;




public class Main {

	public static void main(String[] args) throws Exception {
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
		/*
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
		*/
		// LinkedList
		// adding to shoppinglist LinkedList

		/*
		LinkedList<String> items = new LinkedList<String>();
		
		String option = "Yes";
		
			while (option.equals("Yes") || option.equals("yes")) { 
			System.out.println("Add item to list (yes/no)");
			option = scanner.next();
			
			
			if (option.equals("Yes") || option.equals("yes")) {
				System.out.println("Enter item");
			
			String newItem = scanner.next();
			items.add(newItem);
			}
		}
		System.out.println("Shopping list");
		System.out.println("-------------");
		for (String item : items) {
			System.out.println(item);
		}
		*/
		/*
				Stack<String> jobs = new Stack<>();
				
				jobs.push("Mow lawns");
				jobs.push("Wash windows");
				jobs.push("Take out the trash");
				jobs.push("Give car an oil change");
				
				// [Mow lawns, Wash windows, Take out the trash, Give car an oil change]
				System.out.println(jobs);
				
				jobs.pop();
				
				// [Mow lawns, Wash windows, Take out the trash]
				System.out.println(jobs);
				
				jobs.push("Paint door");
				
				// [Mow lawns, Wash windows, Take out the trash, Paint door]
				System.out.println(jobs);
				
				jobs.pop();
				jobs.pop();
				jobs.pop();
				
				// [Mow lawns]
				System.out.println(jobs);
				
				jobs.push("Trim hedge");
				
				// [Mow lawns, Trim hedge]
				System.out.println(jobs);
		*/
		/* job stack
		Stack<String> jobs = new Stack<>();
		
		int option;
		
		do {
			System.out.println("1:\tAdd job\n2:\tRemove job\n\tEnter option");
			option = scanner.nextInt();
			
			if (option == 1) {							// If 1 is selected user adds job to stack
				System.out.println("Enter job name:");
				String newJob = scanner.next();			// user input
				jobs.add(newJob);						// adds newJob (user input) to stack
				System.out.println(jobs);
				
			
			}else if (option == 2) {
				jobs.pop();								// if 2 is selected removes last job added to stack
				System.out.println(jobs);
			}else {
				System.out.println("Invalid option");
			}
		
		}while (jobs.size() > 0);						// while stack has 1 or more elements continues with do loop, if not continues with code				
				System.out.println("All jobs complete");
				
		*/
		/*	  
		// Reading a text fie  
		File file = new File("C:/temp/BIT504.txt");
		
		FileInputStream stream = new FileInputStream(file);						// Declare a variable for the FileInputStream
		
		StringBuffer buffer = new StringBuffer();								// Declare a buffer to store the date from the file into
		
				
		System.out.println("Size of the file in bytes: " + stream.available());	// Size of file in bytes
		
		int data;																// int variable
		
		while((data = stream.read()) != -1) {									// continue looping until there is no more data to read from file
			buffer.append((char) data);
		}
		
		stream.close();
		
		System.out.println("Content from file: " + buffer);
		*/
		/*
		// adding numbers from file to array
		File file = new File("c:/temp/BIT504.txt");		// source of file to read
		
		FileInputStream stream = new FileInputStream(file);
		
		StringBuffer buffer = new StringBuffer();
		
		int[] numbers = new int[5];
		
		int counter = 0;
		int data;
		
		while ((data = stream.read()) != -1) {
			
			if (data == ',') {											// Checks for comma
				numbers[counter] = Integer.parseInt(buffer.toString());	// Converts integer to string
				counter++;												// Increase counter by 1
				buffer.setLength(0);									// clears the buffer
			
			}else {
				buffer.append((char) data);								// Add character to the buffer
			}
		}
		
		stream.close();
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Index " + i + " = " + numbers[i]);
		}
		*/
		// Writing to file
		/*
		FileOutputStream output = new FileOutputStream("c:/temp/BIT504.txt");	// Create the FileOutputStream object
		String someTxt = "Message to be saved";
		
		for (int i = 0; i < someTxt.length(); i++) {
			output.write(someTxt.charAt(i));
		}
		
		output.close();
		*/
		/*
		File file = new File("C:/temp/BIT504.txt");
		
		FileInputStream stream = new FileInputStream(file);
		
		StringBuffer buffer = new StringBuffer();
		
		int[] numbers = new int[10];
		int counter = 0;
		int data;
		
		while ((data = stream.read()) != -1) {
			if (data == ',' || data == '.') {
				numbers[counter] = Integer.parseInt(buffer.toString());
				counter++;
				buffer.setLength(0);
								
			}else {
				buffer.append((char) data);
			}
		}
		
		stream.close();
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Index " + i + " = " + numbers[i]);
		}
		*/
		/*
		FileOutputStream output = new FileOutputStream("c:/temp/output.txt");
		String choice = "";
        
        while(choice != "no" && choice != "No") {
            System.out.println("Do you wish to write text to the file? (Yes/No)");
            choice = scanner.next();
            if(choice.equals("Yes") || choice.equals("yes")) {
                System.out.println("Enter text to write to file:");
                String input = scanner.next();
                for(int i = 0; i < input.length(); i++) {
                    output.write(input.charAt(i));
                }
            } else if(choice.equals("No") || choice.equals("no")) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");;
			}
		}
				
		output.close();
		
		*/
					
		scanner.close();
	}

}
