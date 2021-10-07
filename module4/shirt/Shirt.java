public class Shirt {
    private String Description;
    private int ColorCode;
    private double Price;

    public Shirt() {}

    public Shirt(String description, int colorCode, double price) {
        Description = description;
        ColorCode = colorCode;
        Price = price;
    }

    public String Display() {
        return "\nDescription: " + Description +
                "\nColor Code: " + ColorCode +
                "\nPrice: " + Price;
    }
}