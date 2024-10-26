import java.util.ArrayList;
import java.util.List;

class Order {
    private Employee employee;
    private List<Menu> menu;

    public Order(Employee employee) {
        this.employee = employee;
        this.menu = new ArrayList<>();
    }

    public void printInvoice(Customer customer) {
        System.out.println("Dibuat Oleh: " + employee.getName());
        System.out.println("Pelanggan : " + customer.getCustomer());
        System.out.println("Menu yang dipesan :");
        double total = 0;
        String price, totalprice;
        for (Menu item : menu) {
            System.out.print("- " + item.getNameItem());
            price = String.format("%.3f", item.getPrice());
            System.out.println(" : Rp." + price );
            total += item.getPrice();
        }
        totalprice = String.format("%.3f", total);
        System.out.println("Total : Rp." + totalprice);
    }

    public void addMenu(Menu menuItem) {
        menu.add(menuItem);
    }
}