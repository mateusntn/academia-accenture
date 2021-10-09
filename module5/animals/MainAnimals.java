import javax.swing.JOptionPane;

public class MainAnimals {
    public static void main(String[] args) {
        String regex = "[0-9]"; 
        String catName = JOptionPane.showInputDialog(null, "Cat's name?");
        String catAge = JOptionPane.showInputDialog(null, "Cat's age?");
        Cat cat = new Cat();
        cat.setName(catName);
        if (catAge.matches(regex)) {
            cat.setAge(Integer.parseInt(catAge));
        } else {
            JOptionPane.showMessageDialog(null, "Invalid age!");
        }
        String dogName = JOptionPane.showInputDialog(null, "Dog's name?");
        String dogAge = JOptionPane.showInputDialog(null, "Dog's age?");
        Dog dog = new Dog();
        dog.setName(dogName);
        if (dogAge.matches(regex)) {
            dog.setAge(Integer.parseInt(dogAge));
        } else {
            JOptionPane.showMessageDialog(null, "Invalid age!");
        }
        cat.MakeSound();
        dog.MakeSound();
    }
}
