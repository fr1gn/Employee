package xrp;

public class Employee implements Payable {
    private int id;
    private static int id_gen;
    private String name;
    private String surname;
    private String position;
    private double salary;

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    Employee() {
        id = id_gen++;
    }
    Employee(String name, String surname, String position, double salary) {
        this();
        setName(name);
        setSurname(surname);
        setPosition(position);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return "Employee: " + id + ". " + name + " " + surname;
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }
}
