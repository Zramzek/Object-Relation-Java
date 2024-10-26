import java.util.ArrayList;
import java.util.List;

class CoffeeShop {
    private String name;
    private List<Employee> employee;
    private List<Menu> menuItem;

    public CoffeeShop(String name, List<Employee> employee, List<Menu> menuItem) {
        this.name = name;
        this.employee = employee;
        this.menuItem = menuItem;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public List<Menu> getMenuItem() {
        return menuItem;
    }

}