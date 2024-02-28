import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){

		System.out.println("Please type your name");

		Scanner scan = new Scanner(System.in);

		String name = scan.nextLine();

		System.out.println("Greetings, " + name + "! Please type your age!");

		int age = scan.nextInt();

		System.out.println("You are " + age + " years old.");

		int reAge = 67;
		int timeForRe = reAge - age;

		System.out.println("You have " + timeForRe + " years until retirement...");
	}

}