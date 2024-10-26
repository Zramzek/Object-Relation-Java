class Employee extends Person {
    private String role;

    public Employee(String name, String phone, String role) {
        super(name, phone);
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}