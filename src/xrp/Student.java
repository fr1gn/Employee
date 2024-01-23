package xrp;

public class Student implements Payable {
    private int id;
    private static int id_gen;
    private String name;
    private String surname;
    private double gpa;
    Student() {
        id = id_gen++;
    }
    Student(String name, String surname, double gpa) {
        this();
        setName(name);
        setSurname(surname);
        setGpa(gpa);
    }

    public int getId() {
        return id;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student: " + id + ". " + name + " " + surname + " " + gpa;
    }

    @Override
    public double getPaymentAmount() {
        if(gpa > 2.67) {
            return 36600.0;
        } else {
            return 0.0;
        }
    }
}


