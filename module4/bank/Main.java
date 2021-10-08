import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Client client1 = new Client("Mateus", "182.112.462-80", "Antonio");
        Account account1 = new Account(1, client1, 784,LocalDate.parse("06-10-2021", dtf));
        account1.Client.DisplayName();
        account1.DisplayBalance();
        
        account1.Deposit(16);

        Client client2 = new Client("Julio", "167.342.563-80", "Vieira");
        Account account2 = new Account(2, client2, 1200,LocalDate.parse("10-10-2021", dtf));
        account2.Client.DisplayName();
        account2.DisplayBalance();


        account1.Deposit(200);
        
        account1.Whithdraw(400);
        
        Account.Transfer(account1, account2, 500);
        
    }
}
