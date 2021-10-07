public class Car {
    public String Brand;
    public int ColorCode;
    public double Price;

    public Car() {}

    public Car(String brand, int colorCode, double price) {
        Brand = brand;
        ColorCode = colorCode;
        Price = price;
    }

    public String Display() {
        return "Brand: " + Brand +
                "\nColor Code: " + ColorCode +
                "\nPrice: " + Price;
    }

    public String Honk() {
        return "Honking!";
    }    
}