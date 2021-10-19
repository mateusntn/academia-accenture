import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Soccer {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(new Player(1, "Jordan", LocalDate.now(), 1, "Goleiro", 95, 1, false));
        players.add(new Player(2, "Marcos Martins", LocalDate.now(), 2, "Lateral Direito", 95, 1, false));
        players.add(new Player(3, "Breno Calixto", LocalDate.now(), 3, "Zagueiro", 95, 1, false));
        players.add(new Player(4, "William Alves", LocalDate.now(), 4, "Zagueiro", 95, 1, false));
        players.add(new Player(5, "Leonan", LocalDate.now(), 6, "Lateral Esquerdo", 95, 1, false));
        players.add(new Player(6, "Maycon Lucas", LocalDate.now(), 5, "Volante", 95, 1, false));
        players.add(new Player(7, "Vitinho", LocalDate.now(), 8, "Volante", 95, 1, false));
        players.add(new Player(8, "Tarcísio", LocalDate.now(), 7, "Meia", 95, 1, false));
        players.add(new Player(9, "Lelê", LocalDate.now(), 10, "Meia", 95, 1, false));
        players.add(new Player(10, "Frank", LocalDate.now(), 11, "Atacante", 95, 1, false));
        players.add(new Player(11, "Pipico", LocalDate.now(), 9, "Atacante", 95, 1, false));
        players.add(new Player(12, "Jão", LocalDate.now(), 12, "Goleiro", 95, 1, false));        
        players.add(new Player(13, "Willian", LocalDate.now(), 13, "Zagueiro", 95, 1, false));
        players.add(new Player(14, "Ikaro", LocalDate.now(), 14, "Zagueiro", 95, 1, false));
        players.add(new Player(15, "Matheus", LocalDate.now(), 16, "Lateral Esquerdo", 95, 1, false));
        players.add(new Player(16, "Roosevelt", LocalDate.now(), 15, "Volante", 95, 1, false));
        players.add(new Player(17, "Frederico", LocalDate.now(), 18, "Volante", 95, 1, false));
        players.add(new Player(18, "Rafael", LocalDate.now(), 17, "Meia", 95, 1, false));
        players.add(new Player(19, "Emanuel", LocalDate.now(), 30, "Meia", 95, 1, false));
        players.add(new Player(20, "Alessandro", LocalDate.now(), 21, "Atacante", 95, 1, false));
        players.add(new Player(21, "Danilo", LocalDate.now(), 19, "Atacante", 95, 1, false));
        players.add(new Player(21, "Vitor", LocalDate.now(), 29, "Atacante", 95, 1, false));
        players.add(new Player(22, "Lucas", LocalDate.now(), 22, "Lateral Direito", 95, 1, false));

        ArrayList<Player> players2 = new ArrayList<Player>();
        players2.add(new Player(1, "Mailson", LocalDate.now(), 1, "Goleiro", 85, 1, false));
        players2.add(new Player(2, "Sander", LocalDate.now(), 2, "Lateral Direito", 85, 1, false));
        players2.add(new Player(3, "Camutanga", LocalDate.now(), 3, "Zagueiro", 85, 1, false));
        players2.add(new Player(4, "Durval", LocalDate.now(), 4, "Zagueiro", 85, 1, false));
        players2.add(new Player(5, "Raul", LocalDate.now(), 6, "Lateral Esquerdo", 85, 1, false));
        players2.add(new Player(6, "Marcão", LocalDate.now(), 5, "Volante", 85, 1, false));
        players2.add(new Player(7, "Ronaldo", LocalDate.now(), 8, "Volante", 85, 1, false));
        players2.add(new Player(8, "Thiago", LocalDate.now(), 7, "Meia", 85, 1, false));
        players2.add(new Player(9, "José", LocalDate.now(), 10, "Meia", 85, 1, false));
        players2.add(new Player(10, "Mikael", LocalDate.now(), 11, "Atacante", 85, 1, false));
        players2.add(new Player(11, "Neto", LocalDate.now(), 9, "Atacante", 85, 1, false));
        players2.add(new Player(12, "Diego", LocalDate.now(), 12, "Goleiro", 85, 1, false));        
        players2.add(new Player(13, "Dudu", LocalDate.now(), 13, "Zagueiro", 85, 1, false));
        players2.add(new Player(14, "Patrick", LocalDate.now(), 14, "Zagueiro", 85, 1, false));
        players2.add(new Player(15, "Maicon", LocalDate.now(), 16, "Lateral Esquerdo", 85, 1, false));
        players2.add(new Player(16, "Gabriel", LocalDate.now(), 15, "Volante", 85, 1, false));
        players2.add(new Player(17, "Guilherme", LocalDate.now(), 18, "Volante", 85, 1, false));
        players2.add(new Player(18, "Everton", LocalDate.now(), 17, "Meia", 85, 1, false));
        players2.add(new Player(19, "Silas", LocalDate.now(), 30, "Meia", 85, 1, false));
        players2.add(new Player(20, "Sandro", LocalDate.now(), 21, "Atacante", 85, 1, false));
        players2.add(new Player(21, "Junior", LocalDate.now(), 19, "Atacante", 85, 1, false));
        players2.add(new Player(21, "Davi", LocalDate.now(), 29, "Atacante", 85, 1, false));
        players2.add(new Player(22, "Daniel", LocalDate.now(), 22, "Lateral Direito", 85, 1, false));
        
        Team team1 = new Team("Santa Cruz", LocalDate.now(), players, players);
        Team team2 = new Team("Popote", LocalDate.now(), players2, players2);

        team1.Players.forEach(x -> x.Training());
        team1.RelatePlayers();
        PrintPlayers(team1.RelatePlayers());

        team2.Players.forEach(x -> x.Training());
        team2.RelatePlayers();
        PrintPlayers(team2.RelatePlayers());
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
        String returnPlayers = "";
        for(Player player:players) {
            returnPlayers += player.toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, returnPlayers, "Team", JOptionPane.DEFAULT_OPTION);
    }
}
