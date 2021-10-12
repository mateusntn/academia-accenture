public class Expense {
    private String Cpf;
    private ExpenseMonth Expenses[];

    public Expense(String cpf, ExpenseMonth[] expenses) {
        Cpf = cpf;
        Expenses = expenses;
    }

    public String GetCpf() {
        return Cpf;
    }

    public ExpenseMonth TotalMonth(int Month) {
        float totalExpenses = 0;
        for(int i = 0; i <= Expenses.length; i++) {
            if (Expenses[i].getMonth() == Month) {
                totalExpenses += Expenses[i].getValue();
            }
        }
        return new ExpenseMonth(Month, totalExpenses);
    }
}
