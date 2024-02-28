public class Main{

	public static void main(String[] args) {

		Team myTeam = new Team("Astralis");

		myTeam.setRank(1);

		System.out.println(myTeam);

        Team team1 = new Team("Team Dignitas");
        team1.setRank(2);
        Team team2 = new Team("Team SoloMid");
        team2.setRank(53);
        Team team3 = new Team("FaZe Clan");
        team3.setRank(4);
        Team team4 = new Team("Vitality");
        team4.setRank(34);
        Team team5 = new Team("G2");
        team5.setRank(15);


        System.out.println(team1);
        System.out.println(team2);
        System.out.println(team3);
        System.out.println(team4);
        System.out.println(team5);
    }


}