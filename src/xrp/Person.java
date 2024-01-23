package xrp;

public class Person implements Payable {
    private int id;
    private static int id_gen;
    private String name;
    private String surname;
    private String position;
    Student student = new Student();

    public int getId() {
        return id;
    }

    Person() {
        id = id_gen++;
    }

    Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        if(position != null && !position.isEmpty()) {
            return position;
        } else {
            return "Student";
        }
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    @Override
    public double getPaymentAmount() {
        if(student.equals(getPosition())) {
            return 36600;
        } else {
            return 0.0;
        }
    }
}