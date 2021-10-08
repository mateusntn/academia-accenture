import javax.swing.JOptionPane;

public class Circle {
    private double Radius;
    private double Area;
    private double Perimeter;
    private double Pi = 3.14;

    public Circle() {}

    public Circle(double radius) {
        Radius = radius;
    }

    public void CalculateArea() {
        Area = Radius * Radius * Pi;
        JOptionPane.showMessageDialog(null, "Area: " + Area);
    }

    public void CalculatePerimeter() {
        Perimeter = 2 * Radius * Pi;
        JOptionPane.showMessageDialog(null, "Perimeter: " + Perimeter);
    }

    public void SetRadius(double value) {
        Radius = value;
    }

    public static void main(String[] args) {
        Circle newCircle = new Circle(10);
        newCircle.CalculateArea();

        newCircle.CalculatePerimeter();

        newCircle.SetRadius(4);

        newCircle.CalculateArea();

        newCircle.CalculatePerimeter();
    }

}