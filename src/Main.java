import java.util.*;  //Password is Admin123
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our shopping Website. Please enter the shopping category you want to explore: ");


        System.out.println("Electronics.");
        ArrayList <String> e =new ArrayList<String>();
        e.add("Iphone 16 pro max");
        e.add("Airpods Pro");
        e.add("Laptop");
        e.add("Tablet");
        e.add("Tevision");




        System.out.println("Groceries");
        ArrayList <String> g=new ArrayList<String>();
        g.add("Apples");
        g.add("Oranges");
        g.add("Cucumbers");
        g.add("Mango");





        System.out.println("Films");
        ArrayList <String> f=new ArrayList<String>();
        f.add("SpiderMan");
        f.add("Batman");
        f.add("Inside Out");


        System.out.println("Books");
        System.out.println("Admin");
        String category = sc.nextLine();




        ArrayList<String> Books=new ArrayList<String>();


        int cost=0;
        switch (category) {
            case "Electronics":


                break;
            case "Groceris":


                break;


            case "Films":


                break;


            case "Books":


                break;


            case "Admin":


                break;
        }


    }
}
