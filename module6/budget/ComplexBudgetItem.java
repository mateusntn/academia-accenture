public class ComplexBudgetItem extends BudgetItem {
    private BudgetItem Item[];
    
    public ComplexBudgetItem(String historic, float value, BudgetItem[] item) {
        super(historic, value);
        Item = item;
    }

    @Override
    public float getValue() {
        int sum = 0;
        for(int i = 1; i < Item.length; i++) {
            sum += Item[i].getValue();
        }
        return sum;
    }
    
    public BudgetItem FindItem(String historic) {
        for(int i = 0; i <= Item.length; i++) {
            if (historic == Item[i].getHistoric()) {
                return Item[i];
            }
        }

        return null;
    }
}
