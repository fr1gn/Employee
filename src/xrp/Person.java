package xrp;

public class Person {
    private int id;
    private static int id_gen;
    private String name;
    private String surname;

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
