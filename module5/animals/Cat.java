import javax.swing.JOptionPane;

public class Cat extends Animals {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void MakeSound() {
        JOptionPane.showMessageDialog(null, getName() + ": Miau!");
        
    }
}
