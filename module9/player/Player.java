import java.time.LocalDate;
import java.util.Random;

public class Player {
    public int Id;
    public String Name;
    public String Nickname;
    public LocalDate BirthDate;
    public int Number;
    public String Position;
    public double Quality;
    public int Cards;
    public boolean Suspended;
    
    public Player(int id, String name, String nickname, LocalDate birthDate, int number, String position, double quality,
            int cards, boolean suspended) {
        Id = id;
        Name = name;
        Nickname = nickname;
        BirthDate = birthDate;
        Number = number;
        Position = position;
        Quality = quality;
        Cards = cards;
        Suspended = suspended;
    }

    public void ApplyCard(int quantity) {
        Cards += quantity;
        if(Cards >= 3) {
            Suspended = true;
        }
    }

    public void ServeSuspension() {
        Cards = 0;
        Suspended = true;
    }

    public void SufferInjury() {
        double newQuality = Quality;

        Random random = new Random();
        int injury = random.nextInt(101);
        if(injury < 5) {            
            newQuality = Quality - (15 * Quality / 100);
        } else if (injury <= 15) {            
            newQuality = Quality - (10 * Quality / 100);
        } else if (injury <= 30) {            
            newQuality = Quality - (5 * Quality / 100);
        } else if (injury <= 60) {            
            newQuality = Quality - 2;
        } else if (injury <= 100) {            
            newQuality = Quality - 1;
        }

        if (newQuality >= 0) {
            Quality = newQuality;
        } else {
            Quality = 0;
        }
    }

    public void Training() {
        double newQuality = Quality;

        Random random = new Random();
        int injury = random.nextInt(101);
        if(injury < 5) {
            newQuality = Quality + 5;
        } else if (injury <= 15) {
            newQuality = Quality + 4;
        } else if (injury <= 30) {
            newQuality = Quality + 3;
        } else if (injury <= 60) {
            newQuality = Quality + 2;
        } else if (injury <= 100) {
            newQuality = Quality + 1;
        }

        if (newQuality <= 100) {
            Quality = newQuality;            
        } else {
            Quality = 100;
        }
    }

    @Override
    public String toString() {
        
        return Position + ": " + Number + " - " + Nickname + " - " + BirthDate + " | CONDITION: " + (Suspended ? "Suspended" : "Can Play") + " | Quality: " + Quality;
    }

        
}
