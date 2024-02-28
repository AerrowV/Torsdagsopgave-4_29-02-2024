import java.util.ArrayList;

class Main{
	
	public static void main(String[] args){

		ArrayList<String> actions = new ArrayList<>();
		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");

		GameMenu newMenu = new GameMenu(actions);

	//	newMenu.displayMenu();

		String userChoice = newMenu.getAction();
		int action = Integer.parseInt(userChoice);

		doAction(action);

	}
	
	public static void doAction(int action) {

		switch (action) {
		case 1:
			System.out.println("1) Start game");
			break;
		case 2:
			System.out.println("2) Resume game");
			break;
		case 3:
			System.out.println("3) Pause game");
			break;
		case 4:
			System.out.println("4) End game");
			break;
		default:
			System.out.println("Not a valid input");
			break;


		}

	}

}