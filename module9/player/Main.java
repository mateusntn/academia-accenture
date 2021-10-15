import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(new Player(1, "Jordan", "Jordan", LocalDate.now(), 1, "Goleiro", 100, 1, false));
        players.add(new Player(2, "Marcos Martins", "Marcos Martins", LocalDate.now(), 2, "Lateral Direito", 100, 1, false));
        players.add(new Player(3, "Breno Calixto", "Breno Calixto", LocalDate.now(), 3, "Zagueiro", 100, 1, false));
        players.add(new Player(4, "William Alves", "William Alves", LocalDate.now(), 4, "Zagueiro", 100, 1, false));
        players.add(new Player(5, "Leonan", "Leonan", LocalDate.now(), 6, "Lateral Esquerdo", 100, 1, false));
        players.add(new Player(6, "Maycon Lucas", " Maycon Lucas", LocalDate.now(), 5, "Volante", 100, 1, false));
        players.add(new Player(7, "Vitor", "Vitinho", LocalDate.now(), 8, "Volante", 100, 1, false));
        players.add(new Player(8, "Tarcísio", "Tarcísio", LocalDate.now(), 7, "Meia", 100, 1, false));
        players.add(new Player(9, "Wesley", "Lelê", LocalDate.now(), 10, "Meia", 100, 1, false));
        players.add(new Player(10, "Fauver Frank", "Frank", LocalDate.now(), 11, "Atacante", 100, 1, false));
        players.add(new Player(11, "Wesley Henrique", "Pipico", LocalDate.now(), 9, "Atacante", 100, 1, false));

        PrintPlayers(players);
    }

    public static boolean MatchCondition(ArrayList<Player> players) {
        for(Player player:players) {
            if(player.Suspended) {
                return false;
            }
        }
        return true;
    }

    public static void PrintPlayers(ArrayList<Player> players) {
        System.out.println("REGISTERED PLAYERS:");
        for(Player player:players) {
            System.out.println(player);
        }
    }
}
