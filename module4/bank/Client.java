import javax.swing.JOptionPane;

public class Client {
    private String Name;
    private String IdCard;
    private String LastName;

    public Client() {}

    public Client(String name, String idCard, String lastName) {
        Name = name;
        IdCard = idCard;
        LastName = lastName;
    }    

    public void DisplayName(){
        JOptionPane.showMessageDialog(null, "Name: " + Name + " " + LastName);
    }

    public String getFullName() {
        return Name + " " + LastName;
    }
}
