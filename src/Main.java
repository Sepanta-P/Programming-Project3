import java.util.*;  //Password is Admin123
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our Website. Please enter the shopping category you want to explore: ");


        ArrayList<String> categories = new ArrayList<>();
        categories.add("Electronics");
        categories.add("Clothing");
        categories.add("Books");

        ArrayList<String> productNames = new ArrayList<>();
        productNames.add("Laptop");
        productNames.add("Headphones");
        productNames.add("Smartphone");
        productNames.add("T-Shirt");
        productNames.add("Jeans");
        productNames.add("Jacket");
        productNames.add("Fiction");
        productNames.add("Non-Fiction");
        productNames.add("Comics");

        ArrayList<Integer> availability = new ArrayList<>();
        availability.add(5);
        availability.add(10);
        availability.add(0);
        availability.add(15);
        availability.add(10);
        availability.add(5);
        availability.add(20);
        availability.add(10);
        availability.add(8);

        ArrayList<Double> prices = new ArrayList<>();
        prices.add(1000.0);
        prices.add(100.0);
        prices.add(800.0);
        prices.add(20.0);
        prices.add(50.0);
        prices.add(100.0);
        prices.add(15.0);
        prices.add(25.0);
        prices.add(10.0);

        ArrayList<String> cart = new ArrayList<>();
        ArrayList<String> orders = new ArrayList<>();



    }
}
