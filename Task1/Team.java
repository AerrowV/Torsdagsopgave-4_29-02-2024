import java.util.ArrayList;

class Team{
	
	private String teamName;
	private int teamRank;
	private ArrayList<String> playerNames = new ArrayList<>();


	public Team(String teamName) {
		this.teamName = teamName;

	}
	public void setRank(int teamRank) {
		this.teamRank = teamRank;
	}

	public String toString() {
		return "Hold: " + teamName + ", Rang: " + teamRank;
	}

}