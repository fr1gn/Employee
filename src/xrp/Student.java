package xrp;

public class Student extends Person {
    private double gpa;

    public Student() {
        super();
    }
    Student(String name, String surname, double gpa) {
        super(name, surname);
        setGpa(gpa);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
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


