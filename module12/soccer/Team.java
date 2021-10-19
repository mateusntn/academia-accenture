import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Team {
    public String Name;
    public LocalDate Foundation;
    public ArrayList<Player> Players;
    public ArrayList<Player> Related;

    public Team() {
    }

    public Team(String name, LocalDate foundation, ArrayList<Player> players, ArrayList<Player> related) {
        Name = name;
        Foundation = foundation;
        Players = players;
        Related = related;
    }

    public ArrayList<Player> RelatePlayers()
    {
        List players = Players.stream()
                                .sorted(Comparator.comparing(Player::getQuality))
                                .limit(11)
                                .collect(Collectors.toList());
        Related = new ArrayList<Player>(players);
        return Related;
    }
}
