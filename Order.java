package MenuItem;

public class Order {
    private Dish[] dishes;
    private Customer customer;

    public Order(Dish[] dishes, Customer customer) {
        this.dishes = dishes;
        this.customer = customer;
    }

    public Dish[] getDishes() {
        return dishes;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (Dish dish : dishes) {
            totalCost += dish.getPrice();
        }
        return totalCost;
    }

    public String generateInvoice() {
        StringBuilder invoice = new StringBuilder();
        invoice.append("Fatura për: ").append(customer.getFullName()).append("\n");
        for (Dish dish : dishes) {
            invoice.append(" - ").append(dish.getName()).append(" (").append(dish.getPrice()).append(" EUR)\n");
        }
        invoice.append("Totali: ").append(getTotalCost()).append(" EUR");
        return invoice.toString();
    }
}