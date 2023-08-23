package MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Customer> customers;
    private List<Dish> menu;
    private List<Order> orders;

    public Restaurant() {
        customers = new ArrayList<>();
        menu = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public Restaurant(String string) {
		// TODO Auto-generated constructor stub
	}

	public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addDishToMenu(Dish dish) {
        menu.add(dish);
    }

    public void placeOrder(Dish[] dishes, Customer customer) {
        Order order = new Order(dishes, customer);
        orders.add(order);
    }

    public List<Dish> getMenu() {
        return menu;
    }
    public void addDish(Dish dish) {
        menu.add(dish);
    }
    public Dish getDishByName(String name) {
        for (Dish dish : menu) {
            if (dish.getName().equalsIgnoreCase(name)) {
                return dish;
            }
        }
        return null;
    }public List<Order> getOrders() {
        return orders;
    }

    public void displayCustomersOrders() {
        for (Order order : orders) {
            System.out.println(order.generateInvoice());
            System.out.println();
        }
    }

    public void displayExpensiveOrder() {
        Order expensiveOrder = null;
        double maxCost = 0;
        for (Order order : orders) {
            if (order.getTotalCost() > maxCost) {
                maxCost = order.getTotalCost();
                expensiveOrder = order;
            }
        }
        if (expensiveOrder != null) {
            System.out.println("Porosia më e shtrenjtë:");
            System.out.println(expensiveOrder.generateInvoice());
        }
    }
}
