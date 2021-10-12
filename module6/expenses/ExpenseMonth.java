public class ExpenseMonth {
    private int Month;
    private float Value;   
    
    public ExpenseMonth() {
    }

    public ExpenseMonth(int month, float value) {
        Month = month;
        Value = value;
    }

    public int getMonth() {
        return Month;
    }

    public float getValue() {
        return Value;
    }    
}
