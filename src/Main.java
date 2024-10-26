import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("Rahman", "08111222333", "Barista");
        Employee e2 = new Employee("Udin", "08444555666", "Cashier");
        Employee e3 = new Employee("Asep", "08777888999", "Waiter");

        Menu menu1 = new Menu("Espresso", 15000);
        Menu menu2 = new Menu("Cappuccino", 20000);
        Menu menu3 = new Menu("Latte", 22000);
        Menu menu4 = new Menu("Americano", 18000);

        Customer c1 = new Customer("Adit");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(menu1);
        menus.add(menu2);
        menus.add(menu3);
        menus.add(menu4);

        Owner owner = new Owner("Jamal", "08123456789", "Kenangan", employees, menus);

        System.out.println("----- Print Coffee Shop -----");
        owner.PrintCoffeeShop();

        Order order = new Order(e1);
        order.addMenu(menu1);
        order.addMenu(menu2);
        order.addMenu(menu4);

        System.out.println("\n----- Print Invoice -----");
        order.printInvoice(c1);
    }
}