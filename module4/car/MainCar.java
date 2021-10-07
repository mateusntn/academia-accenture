public class MainCar {
    public static void main(String[] args) {
        Car car = new Car("HB20S", 2205, 60000);        
        System.out.println(car.Display());
        System.out.println("----------------------");
        System.out.println(car.Honk());
    }
}
