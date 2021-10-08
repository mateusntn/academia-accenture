import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Account {
    private int Number;    
    public Client Client;
    private double Balance;
    private LocalDate Date;

    public Account() {}

    public Account(int number, Client client, double balance, LocalDate date){
        Number = number;
        Client = client;
        Balance = balance;
        Date = date;
        
    }

    public void Deposit(double value) {
        Balance += value;
        JOptionPane.showMessageDialog(null, Client.getFullName() +  ": Depositing $" + value);
        DisplayBalance();
    }

    public void Whithdraw(double value) {
        if(Balance > value) {
            Balance -= value;
            JOptionPane.showMessageDialog(null, Client.getFullName() + ": Withdrawing $" + value);
            DisplayBalance();
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient Funds!");
        }
    }

    public void DisplayBalance() {
        JOptionPane.showMessageDialog(null, Client.getFullName() + " Balance: " + Balance);
    }

    public static void Transfer(Account account1 ,Account account2, double value) {
        if(value > 0) {
            if(account1.Balance > value) {
                account1.Whithdraw(value);
                account2.Deposit(value);
            } else {
                JOptionPane.showMessageDialog(null, "Insufficient Funds!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Value!");
        }
    }
}
