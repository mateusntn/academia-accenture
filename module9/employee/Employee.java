import java.util.ArrayList;

public class Employee {
    public String Name;
    public String LastName;
    private int WorkedHours;
    private double ValuePerHour;

    public Employee() {}

    public Employee(String name, String lastName) {
        Name = name;
        LastName = lastName;
    }

    public void FullName() {
        System.out.println(Name + " " + LastName);
    }

    public void CalculateSalary() {
        System.out.println("Monthly Salary: $" + WorkedHours * ValuePerHour);
    }

    public void IncrementHours(int hours) {
        ValuePerHour += hours;
    }

    public int getWorkedHours() {
        return WorkedHours;
    }

    public void setWorkedHours(int workedHours) {
        WorkedHours = workedHours;
    }

    public double getValuePerHour() {
        return ValuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        ValuePerHour = valuePerHour;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Luis", "Silva");
        employee.setWorkedHours(10);
        employee.setValuePerHour(25.50);

        employee.FullName();
        employee.CalculateSalary();
        employee.IncrementHours(8);
        employee.CalculateSalary();
        
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Mateus","Antonio"));
        employees.add(new Employee("Alanda","Aquino"));
        employees.add(new Employee("Danilo","Miguel"));
        employees.add(new Employee("Diogenes","Oliveira"));
        employees.add(new Employee("Isaias","Cleiton"));
        employees.add(new Employee("Karla","Letícia"));
        employees.add(new Employee("Maria","Cecília"));
        employees.add(new Employee("Shayanne","Naalanda"));
        employees.add(new Employee("Vitor","Matheus"));
    }
}
