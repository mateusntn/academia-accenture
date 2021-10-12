public class BudgetItem {
    private String Historic;    
    private float Value;    

    public BudgetItem() {
    }

    public BudgetItem(String historic, float value) {
        Historic = historic;
        Value = value;
    }

    public String getHistoric() {
        return Historic;
    }

    public float getValue() {
        return Value;
    }    
}
