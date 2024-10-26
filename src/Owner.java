import java.util.List;

class Owner extends Person {
    private CoffeeShop coffeeShop;

    public Owner(String name, String phone, String coffeeshop, List<Employee> employees, List<Menu> menus) {
        super(name, phone);
        this.coffeeShop = new CoffeeShop(coffeeshop, employees, menus);
    }

    public void PrintCoffeeShop() {
        System.out.println("Coffee Shop Name: " + coffeeShop.getName());
        System.out.println("Owner Name: " + super.getName());
        System.out.println("Employees:");
        for (Employee emp : coffeeShop.getEmployee()) {
            System.out.println("- " + emp.getName() + " (" + emp.getRole() + ")");
        }
        System.out.println("Menu Items:");
        for (Menu menu : coffeeShop.getMenuItem()) {
            System.out.println("- " + menu.getNameItem() + " : Rp." + menu.getPrice());
        }
    }
}
