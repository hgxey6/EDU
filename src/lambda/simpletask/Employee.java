package lambda.simpletask;

public class Employee implements Measurable {

    private double salary;

    public Employee() {

    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }
}
