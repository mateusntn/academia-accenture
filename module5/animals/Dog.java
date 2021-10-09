import javax.swing.JOptionPane;

public class Dog extends Animals {

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void MakeSound() {
        JOptionPane.showMessageDialog(null, getName() + ": Au au!");        
    }
    
}
