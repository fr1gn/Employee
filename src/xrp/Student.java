package xrp;

public class Student {
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
}


