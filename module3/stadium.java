import java.util.Scanner;

public class stadium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int categoryA = 50;
        int categoryB = 30;
        int categoryC = 10;
        
        System.out.print("How many Class A tickets were sold? ");
        int quantityA = scanner.nextInt();
        int valueA = quantityA * categoryA;

        System.out.print("How many Class B tickets were sold? ");
        int quantityB = scanner.nextInt();
        int valueB = quantityB * categoryB;

        System.out.print("How many Class C tickets were sold? ");
        int quantityC = scanner.nextInt();
        int valueC = quantityC * categoryC;

        int totalQuantity = quantityA + quantityB + quantityC;
        int totalValue = valueA + valueB + valueC;

        System.out.println("Class A: " + quantityA + " tickets - R$" + valueA);
        System.out.println("Class B: " + quantityB + " tickets - R$" + valueB);
        System.out.println("Class C: " + quantityC + " tickets - R$" + valueC);


        System.out.println("Total: "+ totalQuantity +" tickets - R$"+ totalValue);
        scanner.close();
    }
}
