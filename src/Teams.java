import java.util.ArrayList;

public class Teams {
    private String name;
    private String city;

    private ArrayList<Player> players = new ArrayList<>();


    //constructor
    public Teams(String name, String city){
        this.name = name;
        this.city = city;
    }

    public void addPlayer(Player p) {
        this.players.add(p);
        p.setTeam(this);
    }

}
