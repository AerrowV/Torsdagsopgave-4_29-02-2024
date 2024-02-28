import java.util.ArrayList;
import java.util.Scanner;

class GameMenu {
	
	private ArrayList<String> actions = new ArrayList<>();

	public GameMenu(ArrayList<String> actions){
		this.actions = actions;

	}

	public void displayMenu(){
		for (String action : actions) {
			System.out.println(action);


		}

	}

	public String getAction(){

			System.out.println("Type a number to choose an action:");
			displayMenu();

			Scanner scan = new Scanner(System.in);
			String choice = scan.nextLine();
			return choice;


	}
}


