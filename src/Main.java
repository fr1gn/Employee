import java.util.ArrayList;
import java.util.Collections;

import xrp.Person;
import xrp.Employee;
import xrp.Student;

public class Main {

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.getPosition() + ": " + person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }

    public static void main(String[] args) {
        ArrayList<Person> peopleList = new ArrayList<>();

        Employee employee1 = new Employee("Damir", "Beckturov", "Manager", 27045.78);
        Employee employee2 = new Employee("Tairlan", "Zhanashev", "Senior Developer", 50000.00);
        Student student1 = new Student("Nurzhan", "Kaskeev", 2.5);
        Student student2 = new Student("Zharas", "Satybaldy", 3.0);

        peopleList.add(employee1);
        peopleList.add(employee2);
        peopleList.add(student1);
        peopleList.add(student2);

        Collections.sort(peopleList);

        printData(peopleList);
    }
}
