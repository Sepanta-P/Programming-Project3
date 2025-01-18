import java.util.*;  //Password is admin123
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our Website. Please enter the shopping category you want to explore: ");


        ArrayList<String> categories = new ArrayList<>();//arrayList for all the shopping categories
        categories.add("Electronics");
        categories.add("Clothing");
        categories.add("Books");

        ArrayList<String> productNames = new ArrayList<>();// all the products in order
        productNames.add("Laptop");
        productNames.add("Headphones");
        productNames.add("Smartphone");
        productNames.add("T-Shirt");
        productNames.add("Jeans");
        productNames.add("Jacket");
        productNames.add("Fiction");
        productNames.add("Non-Fiction");
        productNames.add("Comics");

        ArrayList<Integer> availability = new ArrayList<>();// all the quantities
        availability.add(5);
        availability.add(10);
        availability.add(0);
        availability.add(15);
        availability.add(10);
        availability.add(5);
        availability.add(20);
        availability.add(10);
        availability.add(8);

        ArrayList<Double> prices = new ArrayList<>();//all the prices
        prices.add(1000.0);
        prices.add(100.0);
        prices.add(800.0);
        prices.add(20.0);
        prices.add(50.0);
        prices.add(100.0);
        prices.add(15.0);
        prices.add(25.0);
        prices.add(10.0);

        ArrayList<String> cart = new ArrayList<>();// an array for the cart
        ArrayList<String> orders = new ArrayList<>();// an array for the list of all orders
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
                    int categoryIndex=categoryChoice-1;// Determine the selected category index
                    System.out.println("\n--- Product in" + categories.get(categoryIndex)+ "---");
                    for(int i=categoryIndex*3; i<(categoryIndex +1)*3;i++){
                        //Display the products in the selected category
                        String stockMessage= "Out of Stock";
                        if (availability.get(i)>0){
                            stockMessage= availability.get(i)+"in stock";
                        }
                        System.out.println((i %3+1)+". "+productNames.get(i)+" ($"+ prices.get(i)+")"+ stockMessage);
                    }
                    System.out.println(" Select a product to add to cart or press 0 to go back to Main Menu");
                    int productChoice=sc.nextInt();

                    if(productChoice==0){// User chooses to go back
                        break;
                    }
                    if(productChoice<1||productChoice>3){ //Validate Product Choice
                        System.out.println("Please choose a valid product to add to cart");
                    }

                    int productIndex= categoryIndex*3 +productChoice-1;// Calculating the product Index
                    if(availability.get(productIndex)==0){
                        System.out.println("THis product is out of stock");
                    }else{
                        System.out.println("Enter your desired quantity: ");
                        int quantity=sc.nextInt();

                        if(quantity>availability.get(productIndex)){// check if the  quantity  they want is available
                            System.out.println("Insufficient quantity");
                        } else{
                            availability.set(productIndex,availability.get(productIndex)-quantity);//Update Stock
                            double totalPrice=prices.get(productIndex)*quantity;
                            String cartItem=productNames.get(productIndex)+" (x"+quantity+") - $"+totalPrice;
                            cart.add(cartItem);// Add adding the item to cart
                            System.out.println("Added to cart: "+cartItem);
                        }

                    }
                    break;

                case 2:// View Cart
                    if(cart.size()==0){//Check if the cart is empty
                        System.out.println("The cart is empty");
                        break;
                    }

                    System.out.println("\n--- Your Cart ---");
                    for(int i=0; i<categories.size(); i++) {
                        System.out.println((i+1)+". "+categories.get(i));// Display cart with prices
                    }
                    System.out.println("1. Remove Item\n2. Back to Main Menu.");
                    System.out.println("choose an option: ");
                    int cartChoice=sc.nextInt();
                    switch (cartChoice) {
                        case 1:
                            System.out.println("Select Item to remove: ");
                            int removeIndex= sc.nextInt()-1;

                            if(removeIndex<0 || removeIndex>=categories.size()){
                                System.out.println("Please choose a valid item");
                            } else{
                                System.out.println("Removing "+categories.get(removeIndex)+" from your cart.");//For removing an item from cart
                        }
                            break;
                            case 2:
                                break;

                                default:
                                    System.out.println("Please choose a valid option");
                                    break;
                    }
                    break;

                case 3:
                    if (cart.size()==0){// Prevent checkout if cart is empty
                        System.out.println("The cart is empty");
                        break;
                    }
                    System.out.println("\n--- Invoice ---");
                    double total=0;
                    for(String item:cart){
                        System.out.println(item);// Displaying all items inside the cart

                        String priceString= item.substring(item.lastIndexOf("$")+1);
                        double itemPrice= Double.parseDouble(priceString);//Extracting the total price from the item string by parsing it
                        total+=itemPrice;
                    }
                    System.out.println("\nTotal: $"+total);
                    System.out.println("Thank you for your order!");
                    orders.add("Order "+(orders.size()+1)+": "+cart); // saving the order so admin could view them
                    cart.clear();// clearing cart so the next customer won't have any problems
                    break;

                case 4:// Admin View Orders
                    System.out.println("Enter Admin password: ");
                    String password=sc.nextLine();
                    // Loop until the correct password is entered
                    while (!password.equals("admin123")) {
                        System.out.println("Password incorrect, please try again: ");
                        password = sc.nextLine();
                    }
                    if (orders.size()==0){ // check if there are any orders to view
                        System.out.println("No orders yet");
                        break;
                    }
                    System.out.println("\n--- All Orders ---");
                    for(String order:orders){
                        System.out.println(order);// Display each order
                    }
                    break;

                case 5: //Exit
                    System.out.println("Thank you for visiting our website!");
                    running = false; //Terminate the loop tp exit
                    break;
                    default:
                        System.out.println("Please choose a valid option");
            }
        }



    }
}
