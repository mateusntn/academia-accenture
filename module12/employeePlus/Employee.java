import java.time.LocalDate;

public class Employee {
    public String Name;
    public int Registration;
    public double Salary;
    public LocalDate AdmissionDate;
    public String cpf;

    public void ReceiveIncrease(double increase) {
        Salary += increase;
    }

    public double GrossAnnualSalary() {
        return Salary * 12;
    }

    public double CalculateTax() {
        if (Salary > 2500) {
            return ((Salary - 2500) * 17.5 / 100) * 12;
        } else {
            return 0;
        }
    }

    public double NetMonthlySalary() {
        double monthlyTax = CalculateTax() / 12;
        double inss = Salary * 11 / 100;
        return Salary - inss - monthlyTax;
    }

    public double NetAnnualSalary() {
        return NetMonthlySalary() * 12;
    }
}
