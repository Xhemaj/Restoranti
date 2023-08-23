package MenuItem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Krijoni objektin e restorantit
        Restaurant restaurant = new Restaurant();

        // Krijoni klientët
        Customer customer1 = new Customer("John", "Doe", "1234567890", "johndoe@example.com");
        Customer customer2 = new Customer("Jane", "Smith", "9876543210", "janesmith@example.com");
        Customer customer3 = new Customer("Alice", "Johnson", "5678901234", "alicejohnson@example.com");

        // Shtoni klientët në restorant
        restaurant.addCustomer(customer1);
        restaurant.addCustomer(customer2);
        restaurant.addCustomer(customer3);

        // Krijoni ushqimet
        Dish dish1 = new Dish("Pizza Margherita", 10.99, 800);
        Dish dish2 = new Dish("Spaghetti Carbonara", 8.99, 650);
        Dish dish3 = new Dish("Caesar Salad", 6.99, 450);
        Dish dish4 = new Dish("Burger", 7.99, 600);
        Dish dish5 = new Dish("Chicken Alfredo", 12.49, 850);
        Dish dish6 = new Dish("Greek Salad", 9.99, 350);
        Dish dish7 = new Dish("Steak", 15.99, 900);
        Dish dish8 = new Dish("Sushi Roll", 11.99, 500);
        Dish dish9 = new Dish("Fried Rice", 8.49, 600);
        Dish dish10 = new Dish("Pasta Primavera", 9.99, 550);
        Dish dish11 = new Dish("Cheese Fries", 6.49, 450);
        Dish dish12 = new Dish("Grilled Salmon", 13.99, 700);
        Dish dish13 = new Dish("Ice Cream Sundae", 5.99, 400);
        Dish dish14 = new Dish("Mushroom Risotto", 9.99, 500);
        Dish dish15 = new Dish("Taco Salad", 8.49, 400);
        Dish dish16 = new Dish("Grilled Chicken Wrap", 7.99, 450);
        Dish dish17 = new Dish("Veggie Burger", 6.99, 350);
        Dish dish18 = new Dish("Fruit Salad", 5.49, 200);
     // Vendosni porositë tek restoranti
  

        // Shtoni ushqimet në menunë e restorantit
        restaurant.addDishToMenu(dish1);
        restaurant.addDishToMenu(dish2);
        restaurant.addDishToMenu(dish3);
        restaurant.addDishToMenu(dish4);
        restaurant.addDishToMenu(dish5);
        restaurant.addDishToMenu(dish6);
        restaurant.addDishToMenu(dish7);
        restaurant.addDishToMenu(dish8);
        restaurant.addDishToMenu(dish9);
        restaurant.addDishToMenu(dish10);
        restaurant.addDishToMenu(dish11);
        restaurant.addDishToMenu(dish12);
        restaurant.addDishToMenu(dish13);
        restaurant.addDishToMenu(dish14);
        restaurant.addDishToMenu(dish15);
        restaurant.addDishToMenu(dish16);
        restaurant.addDishToMenu(dish17);
        restaurant.addDishToMenu(dish18);
  
        Scanner scanner = new Scanner(System.in);

        // Klientët bëjnë porosi

        customer1.selectDishesFromMenu(restaurant.getMenu(), scanner);
        System.out.println("Zgjedhja e klientit të parë përfundoi.\n");

        customer2.selectDishesFromMenu(restaurant.getMenu(), scanner);
        System.out.println("Zgjedhja e klientit të dytë përfundoi.\n");
        
        customer3.selectDishesFromMenu(restaurant.getMenu(), scanner);
        System.out.println("Zgjedhja e klientit të tretë përfundoi.\n");

        // Vendosni porositë tek restoranti
     // Vendosni porositë tek restoranti
        restaurant.placeOrder(customer1.getSelectedDishes().toArray(new Dish[0]), customer1);
        restaurant.placeOrder(customer2.getSelectedDishes().toArray(new Dish[0]), customer2);
        restaurant.placeOrder(customer3.getSelectedDishes().toArray(new Dish[0]), customer3);


        // Shfaqni faturën për secilin klient
        System.out.println("Faturat:");
        for (Order order : restaurant.getOrders()) {
            System.out.println(order.generateInvoice());
        }
    }
}