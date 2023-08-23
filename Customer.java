package MenuItem;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList; 

public class Customer {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    private List<Dish> selectedDishes;

    public Customer(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        selectedDishes = new ArrayList<>();
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void selectDishesFromMenu(List<Dish> menu, Scanner scanner) {
        System.out.println("Zgjidhni ushqimet që dëshironi nga menuja (për të ndërprerë shtypni 'q'):");

        for (Dish dish : menu) {
            System.out.println(dish.getName() + " (" + dish.getPrice() + " EUR) - Kaloritë: " + dish.getCalories());
            System.out.print("Zgjidhni (shtypni 'p' për të zgjedhur, 'q' për të ndërprerë): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("p")) {
                selectedDishes.add(dish);
            } else if (choice.equalsIgnoreCase("q")) {
                break;
            }
        }
    }

    public List<Dish> getSelectedDishes() {
        return selectedDishes;
    }
}