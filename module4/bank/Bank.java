import java.time.LocalDate;

public class Bank {
    public static void main(String[] args) {
        Client client1 = new Client("Mateus", "182.112.462-80", "Antonio");
        Account account1 = new Account(1, client1, 784, LocalDate.now());
        account1.Client.DisplayName();
        account1.DisplayBalance();
        account1.Deposit(16);

        Client client2 = new Client("Julio", "167.342.563-80", "Vieira");
        Account account2 = new Account(2, client2, 1200, LocalDate.now());
        account2.Client.DisplayName();
        account2.DisplayBalance();


        account1.Deposit(200);
        
        account1.Whithdraw(400);
        
        Account.Transfer(account1, account2, 500);
        
    }
}
