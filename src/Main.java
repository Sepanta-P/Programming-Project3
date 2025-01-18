import java.util.*;  //Password is admin123
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
        boolean running = true;
        while (running) {
            System.out.println("\n--- Welcome to the Online Shop ---");
            System.out.println("1. Browse products");
            System.out.println("2. View Cart");
            System.out.println("3. Checkout");
            System.out.println("4. Admin: View Orders");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\n--- Product Categories ---");
                    for(int i=0; i<categories.size(); i++) {
                        System.out.println((i+1)+". "+categories.get(i));
                    }
                    System.out.println("Select a category: ");
                    int categoryChoice=sc.nextInt();

                    if(categoryChoice < 1 || categoryChoice > categories.size()) {
                        System.out.println("Please choose a valid category.");
                        break;
                    }
                    int categoryIndex=categoryChoice-1;
                    System.out.println("\n--- Product in" + categories.get(categoryIndex)+ "---");
                    for(int i=categoryIndex*3; i<(categoryIndex +1)*3;i++){
                        String stockMessage= "Out of Stock";
                        if (availability.get(i)>0){
                            stockMessage= availability.get(i)+"in stock";
                        }
                        System.out.println((i %3+1)+". "+productNames.get(i)+" ($"+ prices.get(i)+")"+ stockMessage);
                    }
                    System.out.println(" Select a product to add to cart or press 0 to go back to Main Menu");
                    int productChoice=sc.nextInt();

                    if(productChoice==0){
                        break;
                    }
                    if(productChoice<1||productChoice>3){
                        System.out.println("Please choose a valid product to add to cart");
                    }

                    int productIndex= categoryIndex*3 +productChoice-1;
                    if(availability.get(productIndex)==0){
                        System.out.println("THis product is out of stock");
                    }else{
                        System.out.println("Enter your desired quantity: ");
                        int quantity=sc.nextInt();

                        if(quantity>availability.get(productIndex)){
                            System.out.println("Insufficient quantity");
                        } else{
                            availability.set(productIndex,availability.get(productIndex)-quantity);
                            double totalPrice=prices.get(productIndex)*quantity;
                            String cartItem=productNames.get(productIndex)+" (x"+quantity+") - $"+totalPrice;
                            cart.add(cartItem);
                            System.out.println("Added to cart: "+cartItem);
                        }

                    }
                    break;

                case 2:
                    if(cart.size()==0){
                        System.out.println("The cart is empty");
                        break;
                    }

                    System.out.println("\n--- Your Cart ---");
                    break;
            }

            

        








        }
    }
}
