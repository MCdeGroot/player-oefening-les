import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Player p1 = new Player("Leo Messi", LocalDate.of(1987, 6, 24), 5_000_000, 'm');

        Player p2 = new Player("Lieke Martens", LocalDate.of(1987, 6, 24), 3_000_000, 'v');


        ArrayList<Player> players = new ArrayList<>();
        players.add(p1);
        players.add(p2);

        for(Player p : players){
            p.print();
        }

        Teams t1 = new Teams("Ajax", "Amsterdam");
        t1.addPlayer(p1);

    }
}