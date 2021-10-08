import javax.swing.JOptionPane;

public class Rectangle {
    private double Base;
    private double Height;
    private double Area;
    private double Perimeter;

    public Rectangle() {}

    public Rectangle(double base, double height) {
        Base = base;
        Height = height;
    }

    public void CalculateArea() {
        Area = Base * Height;
        JOptionPane.showMessageDialog(null, "Area: " + Area);
    }

    public void CalculatePerimeter() {
        Perimeter = ( 2 * Base ) + ( 2 * Height );
        JOptionPane.showMessageDialog(null, "Perimeter: " + Perimeter);
    }

    public void SetHeight(double value) {
        Height = value;
    }

    public static void main(String[] args) {
        Rectangle newRectangle = new Rectangle(10, 5);
        newRectangle.CalculateArea();

        newRectangle.CalculatePerimeter();

        newRectangle.SetHeight(7);

        newRectangle.CalculateArea();

        newRectangle.CalculatePerimeter();
    }

}