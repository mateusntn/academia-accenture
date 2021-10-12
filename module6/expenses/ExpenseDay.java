public class ExpenseDay extends ExpenseMonth {
    private int Day;

    public ExpenseDay(int month, float value, int day) {
        super(month, value);
        Day = day;
    }

    public int GetDay() {
        return Day;
    }
}
