class Menu {
    private String nameItem;
    private double price;

    public Menu(String nameItem, double price) {
        this.nameItem = nameItem;
        this.price = price;
    }

    public String getNameItem() {
        return nameItem;
    }

    public double getPrice() {
        return price;
    }
}