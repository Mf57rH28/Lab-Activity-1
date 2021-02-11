//This java code contains the following :
// 4 methods (without the main method)
//method to print your name only and dose not return anything (void)
//method to return your University ID (nonvoid)
//method to return your Major
//method to print your name, University ID, and your Major
//By using Scanner to enter the above information 
//-------------------------------------------------------------------------------
//Name:Mufarreh Salem Alshihrey 
//Course Name: 212CSS-4 Object Oriented Programming
//Section: 32
//Academic ID: 441102003
//Instructor: Ibrahim Hassan Ali Alyami
//Date: February 11,2021  - 29/6/1442
//Subject: Lab Activity 1
 
import java.util.Scanner;

public class LabActivity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create a Scanner object to receive inputs from the keyboard
		System.out.println("Enter your name : ");

		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		Name(name);

		System.out.println("Enter your University ID : ");
		String id = input.nextLine();
		UniversityID(id);

		System.out.println("Enter your Major : ");
		String major = input.nextLine();
		Major(major);

		System.out.println();
		All(name, id, major);
	}

	//method to print your name only and dose not return anything (void)
	public static void Name(String nam) {

		System.out.println("Your name is: " + nam);
	}

	//method to return your University ID (nonvoid)
	public static String UniversityID(String uid) {

		System.out.println("Your University ID is: " + uid);

		return (uid);
	}

	//method to return your Major
	public static String Major(String maj) {

		System.out.println("Your Major is: " + maj);

		return (maj);
	}

	//method to print your name, University ID, and your Major
	public static void All(String nam, String uid, String maj) {

		System.out.println(
				"Your name is: " + nam + " - and your University ID is: " + uid + " - and your Major is: " + maj);

	}
}
